package service;

import model.KetQua;
import model.XepHangTayDua;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class XepHangTayDuaService {

    public XepHangTayDuaService() {
    }

    public ArrayList<XepHangTayDua> getListRankRacers(ArrayList<KetQua> dsKetQua) {
        ArrayList<XepHangTayDua> dsXepHangTayDua = new ArrayList<>();

        int flag = 0;
        // 6 6 6 7 7 8 8 9 9
        ArrayList<KetQua> list = new ArrayList<>();
        for (int i = 0; i < dsKetQua.size(); i++) {
            KetQua kq = dsKetQua.get(i);
            if (flag != kq.getDoiDuaTayDua().getId()) {
                if(!list.isEmpty()) {
                    ArrayList clone_list = new ArrayList();
                    clone_list = (ArrayList)list.clone();
                    dsXepHangTayDua.add(new XepHangTayDua(clone_list));
                    list.removeAll(list);
                    list.add(dsKetQua.get(i));
                    flag = kq.getDoiDuaTayDua().getId();
                    continue;
                }
                flag = kq.getDoiDuaTayDua().getId();
            }
            list.add(kq);
        }
        dsXepHangTayDua.add(new XepHangTayDua(list));
        dsXepHangTayDua = tinhToanXepHangTayDua(dsXepHangTayDua);
        dsXepHangTayDua = sortXepHangTayDua(dsXepHangTayDua);
        return dsXepHangTayDua;
    }

    private ArrayList<XepHangTayDua> tinhToanXepHangTayDua(ArrayList<XepHangTayDua> listXepHangTayDua) {
        for (XepHangTayDua xhtd : listXepHangTayDua) {
            String tongThoiGian = "00:00:00";
            int tongDiem = 0;
            for (KetQua kq : xhtd.getDsKetQua()) {
                tongThoiGian = addTime(tongThoiGian, kq.getThoiGian());
                // ve dich moi cong diem
                if (kq.getCoVeDich() == 1) {
                    tongDiem += getDiem(kq.getThuHang());
                }
            }
            xhtd.setTongDiem(tongDiem);
            xhtd.setTongThoiGian(tongThoiGian);
        }
        return listXepHangTayDua;
    }

    private ArrayList<XepHangTayDua> sortXepHangTayDua(ArrayList<XepHangTayDua> listXepHangTayDua) {
        Collections.sort(listXepHangTayDua, new Comparator<XepHangTayDua>(){
            @Override
            public int compare(XepHangTayDua o1, XepHangTayDua o2){
                if(o1.getTongDiem() == o2.getTongDiem()) {
                    return convertTimeToseconds(o1.getTongThoiGian()) < convertTimeToseconds(o2.getTongThoiGian()) ? -1 : 1;
                } else {
                    return o1.getTongDiem() < o2.getTongDiem() ? 1 : -1;
                }
            }
        });
        return listXepHangTayDua;
    }

    private String addTime(String d1, String d2){
        long t1 = convertTimeToseconds(d1);
        long t2 = convertTimeToseconds(d2);

        return convertTimeToString(t1+t2);
    }

    private long convertTimeToseconds(String time) {
        long res = 0;
        String[] values = time.split(":");
        res = Long.parseLong(values[0]) * 3600 + Long.parseLong(values[1])*60 + Long.parseLong(values[2]);
        return res;
    }

    private String convertTimeToString(long time) {
        long hour, minute, second;
        hour = time / 3600;
        minute = time % 3660 / 60;
        second = time % 3600 % 60;
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        return String.format("%02d:%02d:%02d", hour,minute,second);
    }

    private int getDiem(int thuHang) {
        switch (thuHang) {
            case 1:
                return 25;
            case 2:
                return 18;
            case 3:
                return 15;
            case 4:
                return 12;
            case 5:
                return 10;
            case 6:
                return 8;
            case 7:
                return 6;
            case 8:
                return 4;
            case 9:
                return 2;
            case 10:
                return 1;
            default:
                return 0;
        }
    }
}
