/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Answer;

/**
 *
 * @author Hoang Quyet
 */
public class Client2 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        try {
            Socket client=new Socket("localhost", 1299);
            DataOutputStream ou=new DataOutputStream(client.getOutputStream());
            DataInputStream in=new DataInputStream(client.getInputStream());
            ObjectInputStream in2=new ObjectInputStream(client.getInputStream());
             ObjectOutputStream ou2=new ObjectOutputStream(client.getOutputStream());
            ou.writeUTF("hihi");
            System.out.println(in.readUTF());
            
            
            

            
            
            int N=in.readInt();
            System.out.println("N="+N);
            int[] sa =new int[N];
            for(int i=0;i<N;i++){
                sa[i]=in.readInt();
            }
            
            Arrays.sort(sa);
            for(int i=0;i<N/2;i++){
                int f=sa[i];
                sa[i]=sa[sa.length-1-i];
                sa[sa.length-1-i]=f;
            }
            System.out.println(Arrays.toString(sa));
            //in.readUTF();
            String s1=in.readUTF();System.out.println(s1);
            String s2=in.readUTF();System.out.println(s2);
            int dem=0;
            while(s2.contains(s1)){
                s2=s2.replaceFirst(s1, ".");
                dem++;
                System.out.println(dem);
            }
            ou.writeInt(dem);
            
            try{
                Object an= in2.readObject();
                System.out.println(an.toString());
            }
            catch (SocketException e){
                System.out.println("huhu bi loi");
        }
//            System.out.println(an.toString());
        }catch(Exception e){
            
        }
            
    }
}
