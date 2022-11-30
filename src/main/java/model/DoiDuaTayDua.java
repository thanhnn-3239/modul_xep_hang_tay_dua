package model;

import java.io.Serializable;
import java.util.Date;

public class DoiDuaTayDua implements Serializable {
    private int id;
    private Date timeIn;
    private Date timeOut;
    private TayDua tayDua;
    private DoiDua doiDua;

    public DoiDuaTayDua() {
    }

    public DoiDuaTayDua(int id, Date timeIn, Date timeOut, TayDua tayDua, DoiDua doiDua) {
        this.id = id;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.tayDua = tayDua;
        this.doiDua = doiDua;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Date timeIn) {
        this.timeIn = timeIn;
    }

    public Date getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Date timeOut) {
        this.timeOut = timeOut;
    }

    public TayDua getTayDua() {
        return tayDua;
    }

    public void setTayDua(TayDua tayDua) {
        this.tayDua = tayDua;
    }

    public DoiDua getDoiDua() {
        return doiDua;
    }

    public void setDoiDua(DoiDua doiDua) {
        this.doiDua = doiDua;
    }
}
