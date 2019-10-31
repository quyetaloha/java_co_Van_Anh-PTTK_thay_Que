/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.IRMIServer;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ServerConfiguration;
import model.Student;

/**
 *
 * @author Hoang Quyet
 */
public class Client1 {
    public static void main(String[] args) {
        try{
            Registry registry=LocateRegistry.getRegistry("dia chi", 1099);
            IRMIServer ir=(IRMIServer) Naming.lookup("Server");
            Student student=new Student();
            ServerConfiguration sr=new ServerConfiguration();
            ServerConfiguration config=ir.getNumericServerDes(student, sr);
            Socket socket1=new Socket("dia chi", 1000);
            Socket socket2=new Socket("dia chi", 1001);
            
            
            
        } catch (NotBoundException ex) {
            Logger.getLogger(Client1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Client1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Client1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Client1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
