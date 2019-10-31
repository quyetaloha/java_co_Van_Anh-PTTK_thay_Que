/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4.pkg2;

import java.io.Serializable;

/**
 *
 * @author Hoang Quyet
 */
public class KhachHang implements  Serializable{
    private int ma;
    private String hoten,diachi,sdt;

    public KhachHang(int ma, String hoten, String diachi, String sdt) {
        this.ma = ma;
        this.hoten = hoten;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public int getMa() {
        return ma;
    }

    public String getHoten() {
        return hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,hoten,diachi,sdt
        };
    }
}
