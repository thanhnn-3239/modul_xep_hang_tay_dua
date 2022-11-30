package model;

import java.io.Serializable;
import java.util.ArrayList;

public class XepHangTayDua implements Serializable {
    private ArrayList<KetQua> dsKetQua;
    private int tongDiem;
    private String tongThoiGian;

    public XepHangTayDua() {
    }

    public XepHangTayDua(ArrayList<KetQua> dsKetQua) {
        this.dsKetQua = dsKetQua;
    }

    public XepHangTayDua(ArrayList<KetQua> dsKetQua, int tongDiem, String tongThoiGian) {
        this.dsKetQua = dsKetQua;
        this.tongDiem = tongDiem;
        this.tongThoiGian = tongThoiGian;
    }

    public ArrayList<KetQua> getDsKetQua() {
        return dsKetQua;
    }

    public void setDsKetQua(ArrayList<KetQua> dsKetQua) {
        this.dsKetQua = dsKetQua;
    }

    public int getTongDiem() {
        return tongDiem;
    }

    public void setTongDiem(int tongDiem) {
        this.tongDiem = tongDiem;
    }

    public String getTongThoiGian() {
        return tongThoiGian;
    }

    public void setTongThoiGian(String tongThoiGian) {
        this.tongThoiGian = tongThoiGian;
    }
}
