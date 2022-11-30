package model;

import java.io.Serializable;
import java.util.Date;

public class ChangDua implements Serializable {
    private int id;
    private String ten;
    private int soVong;
    private String diaDiem;
    private Date thoiGian;
    private String moTa;
    private MuaGiai muaGiai;

    public ChangDua() {
    }

    public ChangDua(int id, String ten, int soVong, String diaDiem, Date thoiGian, String moTa, MuaGiai muaGiai) {
        this.id = id;
        this.ten = ten;
        this.soVong = soVong;
        this.diaDiem = diaDiem;
        this.thoiGian = thoiGian;
        this.moTa = moTa;
        this.muaGiai = muaGiai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoVong() {
        return soVong;
    }

    public void setSoVong(int soVong) {
        this.soVong = soVong;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public MuaGiai getMuaGiai() {
        return muaGiai;
    }

    public void setMuaGiai(MuaGiai muaGiai) {
        this.muaGiai = muaGiai;
    }
}
