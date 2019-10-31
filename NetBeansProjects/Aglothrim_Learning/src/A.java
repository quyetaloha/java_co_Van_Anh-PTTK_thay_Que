
import static java.lang.Math.pow;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hoang Quyet
 */
public class A {
    static int  du=(int) (1e9+7);
    public static long mu(int n,long k){
        long st;
        if(k==0) return 1;
        st=mu(n,k/2);
        if(k%2==0){
            return st*st%du;
        }
        return (n*st%du)*st%du;
        
        
    }
    public static void main(String[] args) {
       
        int n,t;
        int k;
        Scanner in= new Scanner(System.in);
        t=in.nextInt();
        while(t>0){
            n=in.nextInt();
            k=in.nextInt();
            System.out.println(mu(n,k));
            t--;
        }
        
    }
}
