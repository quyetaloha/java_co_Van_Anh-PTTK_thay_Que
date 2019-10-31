/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Hoang Quyet
 */
public class NganHang implements Serializable{
    private String ma,ten;
    private double laixuat;
    private String ngay;
    private int sothang;

    public NganHang(String ma, String ten, double laixuat, String ngay, int sothang) {
        this.ma = ma;
        this.ten = ten;
        this.laixuat = laixuat;
        this.ngay = ngay;
        this.sothang = sothang;
    }

    public NganHang() {
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,laixuat,ngay,sothang
        };
    }
}
