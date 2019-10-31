
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
// 121312141213121
public class C {
    
    public static int chia(int n,long k){
        
        if(n==1) return 1;
        long m=(long) pow(2,n-1);
        
        if(k>m){
            k=k-m;return chia(n-1,k);
        }
        if(k<m){
            return chia(n-1,k);
        }
        return n;
        
        
    }
    public static void main(String[] args) {
        int n,t;
        long k;
        Scanner in= new Scanner(System.in);
        t=in.nextInt();
        while(t>0){
            n=in.nextInt();
            k=in.nextLong();
            System.out.println(chia(n,k));
            t--;
        }
        
    }
}
