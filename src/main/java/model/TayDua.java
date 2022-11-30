package model;

import java.io.Serializable;
import java.util.Date;

public class TayDua implements Serializable {
    private int id;
    private String ten;
    private Date ngaySinh;
    private String quocTich;
    private String tieuSu;

    public TayDua() {
    }

    public TayDua(int id, String ten, Date ngaySinh, String quocTich, String tieuSu) {
        this.id = id;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.quocTich = quocTich;
        this.tieuSu = tieuSu;
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getTieuSu() {
        return tieuSu;
    }

    public void setTieuSu(String tieuSu) {
        this.tieuSu = tieuSu;
    }
}
