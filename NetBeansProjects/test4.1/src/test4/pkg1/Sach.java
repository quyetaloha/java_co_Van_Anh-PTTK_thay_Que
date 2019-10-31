/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4.pkg1;

import java.io.Serializable;

/**
 *
 * @author Hoang Quyet
 */
public class Sach implements Serializable{
    private int ma;
    private String ten,tacgia,cnganh;
    private int nam,sluong;

    public Sach(int ma, String ten, String tacgia, String cnganh, int nam, int sluong) {
        this.ma = ma;
        this.ten = ten;
        this.tacgia = tacgia;
        this.cnganh = cnganh;
        this.nam = nam;
        this.sluong = sluong;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public void setCnganh(String cnganh) {
        this.cnganh = cnganh;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void setSluong(int sluong) {
        this.sluong = sluong;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getTacgia() {
        return tacgia;
    }

    public String getCnganh() {
        return cnganh;
    }

    public int getNam() {
        return nam;
    }

    public int getSluong() {
        return sluong;
    }
    public Object[] toObject(){
        return new Object[]{ma,ten,tacgia,cnganh,nam,sluong};
    }
}
