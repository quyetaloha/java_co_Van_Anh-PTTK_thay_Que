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
public class QuanLyMuon implements Serializable{
    private BanDoc bandoc;
    private Sach sach;
    private int sluong;
    private String ttrang;

    public QuanLyMuon(BanDoc bandoc, Sach sach, int sluong, String ttrang) {
        this.bandoc = bandoc;
        this.sach = sach;
        this.sluong = sluong;
        this.ttrang = ttrang;
    }

    public void setBandoc(BanDoc bandoc) {
        this.bandoc = bandoc;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public void setSluong(int sluong) {
        this.sluong = sluong;
    }

    public void setTtrang(String ttrang) {
        this.ttrang = ttrang;
    }

    public BanDoc getBandoc() {
        return bandoc;
    }

    public Sach getSach() {
        return sach;
    }

    public int getSluong() {
        return sluong;
    }

    public String getTtrang() {
        return ttrang;
    }
    public Object[] toObject(){
        return new Object[]{
          bandoc.getMa(),bandoc.getHoten(),sach.getMa(),sach.getTen(),sluong,ttrang
        };
    }
}
