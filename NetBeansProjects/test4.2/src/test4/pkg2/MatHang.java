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
public class MatHang implements Serializable{
    private int ma;
    private String ten,nhom;
    private int gia;

    public MatHang(int ma, String ten, String nhom, int gia) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.gia = gia;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getNhom() {
        return nhom;
    }

    public int getGia() {
        return gia;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,nhom,gia
        };
    }
}
