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
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Hoang Quyet
 */
public class Server3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket myServer=new ServerSocket(1299);
        Socket clientSocket = myServer.accept();
        ObjectInputStream in2=new ObjectInputStream(clientSocket.getInputStream());
        ObjectOutputStream an=new ObjectOutputStream(clientSocket.getOutputStream());
        an.writeObject(4);
        Thread.sleep(3000);
       
    }
}
