/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.IRegistration;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;

/**
 *
 * @author Hoang Quyet
 */
public class Client2 {
    public static void main(String[] args) {
        try{
        Registry registry=LocateRegistry.getRegistry(1299);
        IRegistration ir= (IRegistration) Naming.lookup("Server");
        Student s=new Student("rew", "fd", "fs", 3);
        System.out.println(ir.layport1(s));
        System.out.println(ir.layport2(s));
        } catch (RemoteException ex) {
            Logger.getLogger(Client2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(Client2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Client2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
