/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import model.Student;

/**
 *
 * @author Hoang Quyet
 */
public class Client1 {
    public static void main(String[] args) {
        try {
        Socket client=new Socket("", 1299);
        ObjectOutputStream ou=new ObjectOutputStream(client.getOutputStream());
        ObjectInputStream in=new ObjectInputStream(client.getInputStream());
        
        int s=(int) in.readObject();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
