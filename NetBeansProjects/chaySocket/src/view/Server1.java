/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import model.Student;

/**
 *
 * @author Hoang Quyet
 */
public class Server1 {
    public static void main(String[] args) {
        try {
        ServerSocket myServer=new ServerSocket(10009);
        Socket clientSocket = myServer.accept();
        ObjectInputStream in=new ObjectInputStream(clientSocket.getInputStream());
            System.out.println("a");
        ObjectOutputStream ou=new ObjectOutputStream(clientSocket.getOutputStream());
            System.out.println("b");
        Student st=(Student) in.readObject();
            System.out.println("c");
        System.out.println("doc thanh cong");
        clientSocket.close();
        myServer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
