
import java.util.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hoang Quyet
 */
public class b11 {
    public static void main(String[] args) {
        Set<Integer> set= new TreeSet<>();
        int N,T,ma=-1;
        Scanner s=new Scanner(System.in);
        T=s.nextInt();
        while(T>0){
            N=s.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i=0;i<N;i++){
                int a=s.nextInt();
                if (set.contains(a)) {
                    list.add(a);
                }
                set.add(a);
                
            
            }
            if (list.isEmpty()){
                System.out.println("NO");
                break;
            }
            else{
                for(int number:set){
                    for(int i=0;i<list.size();i++){
                        if(number==list.get(i)){
                            System.out.println(number);
                            break;
                        }
                    }
                    
                }
            }
           T=T-1;
        }
        
    }
}
