package model;

import java.io.Serializable;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Viet Nguyen
 */
public class Student implements Serializable{
    static final long serialVersionUID=1L;
    private String maSV;
    private String hovaten;
    private String IP;
    private int group;
    private String strExamCode1;
    private String strExamCode2;
    private int numericCode3;
    private int numericCode4;
    private int[] numericExam;
    boolean isAlreadyRegistration;

    public Student(String maSV, String hovaten, String IP, int group) {
        this.maSV = maSV;
        this.hovaten = hovaten;
        this.IP = IP;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" + "maSV=" + maSV + ", hovaten=" + hovaten + ", IP=" + IP + ", group=" + group + ", strExamCode1=" + strExamCode1 + ", strExamCode2=" + strExamCode2 + ", numericCode3=" + numericCode3 + ", numericCode4=" + numericCode4 + ", numericExam=" + Arrays.toString(numericExam) + ", isAlreadyRegistration=" + isAlreadyRegistration + '}';
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setStrExamCode1(String strExamCode1) {
        this.strExamCode1 = strExamCode1;
    }

    public void setStrExamCode2(String strExamCode2) {
        this.strExamCode2 = strExamCode2;
    }

    public void setNumericCode3(int numericCode3) {
        this.numericCode3 = numericCode3;
    }

    public void setNumericCode4(int numericCode4) {
        this.numericCode4 = numericCode4;
    }

    public void setNumericExam(int[] numericExam) {
        this.numericExam = numericExam;
    }

    public void setIsAlreadyRegistration(boolean isAlreadyRegistration) {
        this.isAlreadyRegistration = isAlreadyRegistration;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHovaten() {
        return hovaten;
    }

    public String getIP() {
        return IP;
    }

    public int getGroup() {
        return group;
    }

    public String getStrExamCode1() {
        return strExamCode1;
    }

    public String getStrExamCode2() {
        return strExamCode2;
    }

    public int getNumericCode3() {
        return numericCode3;
    }

    public int getNumericCode4() {
        return numericCode4;
    }

    public int[] getNumericExam() {
        return numericExam;
    }

    public boolean isIsAlreadyRegistration() {
        return isAlreadyRegistration;
    }
    
   
}
