package dao;

import model.*;
import service.XepHangTayDuaService;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class XepHangTayDuaDAO extends DAO{
    public XepHangTayDuaDAO() {
        super();
    }

    public ArrayList<XepHangTayDua> getListRankRacers(MuaGiai muagiai) {
        ArrayList<XepHangTayDua> dsXepHangTayDua = new ArrayList<>();
        ArrayList<KetQua> dsKetQua = new ArrayList<>();
        String sql = "SELECT * FROM view_ket_qua";
        if(muagiai != null) {
            sql = sql + " WHERE id_mua_giai = " + muagiai.getId();
        }
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                MuaGiai mg = new MuaGiai();
                mg.setId(rs.getInt("ma_mua_giai"));
                mg.setTen(rs.getString("ten_mua_giai"));

                ChangDua cd = new ChangDua();
                cd.setTen(rs.getString("ten_chang_dua"));
                cd.setMuaGiai(mg);

                TayDua td = new TayDua();
                td.setTen(rs.getString("ten_tay_dua"));
                td.setQuocTich(rs.getString("quoc_tich_tay_dua"));

                DoiDua dd = new DoiDua();
                dd.setTen(rs.getString("ten_doi_dua"));

                DoiDuaTayDua ddtd = new DoiDuaTayDua();
                ddtd.setId(rs.getInt("id_doi_dua_tay_dua"));
                ddtd.setTayDua(td);
                ddtd.setDoiDua(dd);

                KetQua kq = new KetQua();
                kq.setThuHang(rs.getInt("thu_hang_ket_qua"));
                kq.setCoVeDich(rs.getInt("co_ve_dich_ket_qua"));
                kq.setChangDua(cd);
                kq.setDoiDuaTayDua(ddtd);
                kq.setThoiGian(rs.getTime("thoi_gian_ket_qua").toString());

                dsKetQua.add(kq);
            }
            dsXepHangTayDua = new XepHangTayDuaService().getListRankRacers(dsKetQua);

        } catch (SQLException e) {
            e.printStackTrace();
            dsXepHangTayDua = null;
        }
        return dsXepHangTayDua;
    }
}
