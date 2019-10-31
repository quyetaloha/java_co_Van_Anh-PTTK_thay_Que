
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
public class E {
    
    public static int fibonacci(int n,int k){
        if(n==1) return 1;
        if(n==2) return 2;
        
        
        
    }
    public static void main(String[] args) {
       
        int n,t;
        int k;
        Scanner in= new Scanner(System.in);
        t=in.nextInt();
        while(t>0){
            n=in.nextInt();
            k=in.nextInt();
            System.out.println(fibonacci(n,k));
            t--;
        }
        
    }
}
