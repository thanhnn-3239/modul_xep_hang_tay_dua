package model;

import java.io.Serializable;

public class KetQua implements Serializable {
    private int id;
    private int thuHang;
    private String thoiGian; //de dang tinh toan
    private int coVeDich;
    private ChangDua changDua;
    private DoiDuaTayDua doiDuaTayDua;

    public KetQua() {
    }

    public KetQua(int id, int thuHang, String thoiGian, int coVeDich, ChangDua changDua, DoiDuaTayDua doiDuaTayDua) {
        this.id = id;
        this.thuHang = thuHang;
        this.thoiGian = thoiGian;
        this.coVeDich = coVeDich;
        this.changDua = changDua;
        this.doiDuaTayDua = doiDuaTayDua;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getThuHang() {
        return thuHang;
    }

    public void setThuHang(int thuHang) {
        this.thuHang = thuHang;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public int getCoVeDich() {
        return coVeDich;
    }

    public void setCoVeDich(int coVeDich) {
        this.coVeDich = coVeDich;
    }

    public ChangDua getChangDua() {
        return changDua;
    }

    public void setChangDua(ChangDua changDua) {
        this.changDua = changDua;
    }

    public DoiDuaTayDua getDoiDuaTayDua() {
        return doiDuaTayDua;
    }

    public void setDoiDuaTayDua(DoiDuaTayDua doiDuaTayDua) {
        this.doiDuaTayDua = doiDuaTayDua;
    }
}
