/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import model.Answer;
import model.Student;

/**
 *
 * @author Hoang Quyet
 */
public class Server2 {
    public static void main(String[] args) {
        try {
        ServerSocket myServer=new ServerSocket(1299);
        Socket clientSocket = myServer.accept();
            DataInputStream in=new DataInputStream(clientSocket.getInputStream());
            System.out.println("a");
            DataOutputStream ou=new DataOutputStream(clientSocket.getOutputStream());
            System.out.println("b");
            
            ObjectOutputStream an=new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream in2=new ObjectInputStream(clientSocket.getInputStream());
        String s= in.readUTF();
            System.out.println(s);
            ou.writeUTF("ahaha");
//            
            int N=4;
            ou.writeInt(N);
            ou.writeInt(7);
            ou.writeInt(3);
            ou.writeInt(5);
            ou.writeInt(1);
            
           ou.writeUTF("abc");
           ou.writeUTF("abc haong abcdf sfod dfsabc");
            System.out.println(in.readInt());
            
            Answer a=new Answer();
            
           an.writeObject(a);
           Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
