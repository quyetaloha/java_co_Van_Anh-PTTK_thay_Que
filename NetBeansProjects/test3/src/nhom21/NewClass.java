/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom21;

/**
 *
 * @author Hoang Quyet
 */
class  A{
        protected int b=3;
        
        public void in(){
            System.out.println("in");
        }
        private int in(int a){
            System.out.println(a);
            return 3;
        }
    }
public class NewClass {
    
    public static void main(String[] args) {
        A a= new A();
        System.out.println(a.b);
    }
}
