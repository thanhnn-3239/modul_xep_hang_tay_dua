package model;

import java.io.Serializable;
import java.util.Date;

public class MuaGiai implements Serializable {
    private int id;
    private String ten;
    private Date tgBatDau;
    private Date tgKetThuc;
    private String moTa;

    public MuaGiai() {
    }

    public MuaGiai(int id, String ten, Date tgBatDau, Date tgKetThuc, String moTa) {
        this.id = id;
        this.ten = ten;
        this.tgBatDau = tgBatDau;
        this.tgKetThuc = tgKetThuc;
        this.moTa = moTa;
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

    public Date getTgBatDau() {
        return tgBatDau;
    }

    public void setTgBatDau(Date tgBatDau) {
        this.tgBatDau = tgBatDau;
    }

    public Date getTgKetThuc() {
        return tgKetThuc;
    }

    public void setTgKetThuc(Date tgKetThuc) {
        this.tgKetThuc = tgKetThuc;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
