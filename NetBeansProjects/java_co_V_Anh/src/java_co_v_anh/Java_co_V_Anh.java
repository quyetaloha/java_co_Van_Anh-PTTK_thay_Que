/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_co_v_anh;

/**
 *
 * @author Hoang Quyet
 */
public class Java_co_V_Anh {
    public static void tinh(int... a){
        for(int x:a)
            System.out.println(x);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={0,1,2,3,4};
        tinh(0,1,3,2);
        
    }
    
       
}
