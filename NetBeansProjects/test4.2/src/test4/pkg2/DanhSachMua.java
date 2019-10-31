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
public class DanhSachMua implements Serializable{
    private KhachHang kh;
    private MatHang mh;
    private int sluong;

    public DanhSachMua(KhachHang kh, MatHang mh, int sluong) {
        this.kh = kh;
        this.mh = mh;
        this.sluong = sluong;
    }

    public KhachHang getKh() {
        return kh;
    }

    public MatHang getMh() {
        return mh;
    }

    public int getSluong() {
        return sluong;
    }
    public Object[] toObject(){
        return new Object[]{
            kh.getMa(),kh.getHoten(),mh.getMa(),mh.getTen(),sluong
        };
    }
}
