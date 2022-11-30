package dao;

import model.MuaGiai;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MuaGiaiDAO extends DAO{
    public MuaGiaiDAO(){
        super();
    }

    public ArrayList<MuaGiai> getListMuaGiai(){
        ArrayList<MuaGiai> dsMuaGiai = new ArrayList<>();
        String sql = "SELECT * FROM tblMuaGiai";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                MuaGiai mg = new MuaGiai();
                mg.setId(rs.getInt("id"));
                mg.setTen(rs.getString("ten"));
                mg.setTgBatDau(rs.getDate("tg_bat_dau"));
                mg.setTgKetThuc(rs.getDate("tg_ket_thuc"));
                System.out.println(mg);
                dsMuaGiai.add(mg);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            dsMuaGiai = null;
        }
        return dsMuaGiai;
    }
}
