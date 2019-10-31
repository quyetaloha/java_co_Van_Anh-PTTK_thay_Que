/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author Hoang Quyet
 */
public class xuly {
    static public String daoxau(String s){
        
        StringBuffer kq=new StringBuffer(s);
        kq=kq.reverse();
        return kq.toString();
    }
//    public static String chuanHoa(String strInput) {
//        String strOutput = "";
//        StringTokenizer strToken = new StringTokenizer(strInput, " ,\t,\r");
//        strOutput += "" + chuyenInHoa(strToken.nextToken());
//        while (strToken.hasMoreTokens()) {
//            strOutput += " " + chuyenInHoa(strToken.nextToken());
//        }
//        return (strOutput);
//    }
//    public static String chuyenInHoa(String str) {
//        String s, strOutput;
//        s = str.substring(0, 1);
//        strOutput = str.replaceFirst(s, s.toUpperCase());
//        return (strOutput);
//    }
    
    public static String chuanhoa(String str){
        String kq="";
        StringTokenizer stringTokenizer=new StringTokenizer(str, " ,.");
        while(stringTokenizer.hasMoreTokens()){
            String s=stringTokenizer.nextToken();
            String k=s.substring(0, 1);
            s=s.replaceFirst(k, k.toUpperCase());
            kq+=s+" ";
        }
        return kq.substring(0,kq.length()-1);
    }
    
    public static int ucln(int a,int b){
        if(b==0) return a;
        return ucln(b,a%b);
    }
    public static int bcnn(int a,int b){
        return (a*b/ucln(a,b));
    }
    
    public static int timmax(int[] a){
        int max=0;
        for(int i=0;i<a.length;i++){
            if(max<a[i]) max=a[i];
        }
        return max;
    }
    public static void main(String[] args) {
        
        String s="a b c 3 d 2 a 545 1 b";
        int kq=0;
        for(int i=0;i<s.length();i++){
            int k=s.charAt(i);
            if(k>=48&&k<=57) {
                kq+=k-48;
            }
        }
        System.out.println(kq);
        
        //System.out.println(chuanhoa2("a b c 3 d 2 a 5 b"));
    }
}
