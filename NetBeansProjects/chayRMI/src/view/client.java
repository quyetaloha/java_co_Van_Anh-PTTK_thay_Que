/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.IRegistration;
import control.xuly;
import java.io.DataInputStream;
import java.io.DataOutputStream;
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
import model.Answer;
import model.Student;

/**
 *
 * @author Hoang Quyet
 */
public class client {
    public static void main(String[] args) throws IOException {
        try {
            
            Socket client=new Socket("localhost", 1299);
            DataOutputStream ou=new DataOutputStream(client.getOutputStream());
            DataInputStream in=new DataInputStream(client.getInputStream());
            ou.writeUTF("client gui");
            System.out.println(in.readUTF());
            
            
            Registry reg=LocateRegistry.getRegistry("quyet", 1099);
            IRegistration ir=(IRegistration) Naming.lookup("Server");
            
            
            
            Student sv=new Student("B15DCCN446", "Hoang Xuan Quyet", "192.168.1.241", 2);
            Student b = ir.register(sv);
            System.out.println(b.toString());
            String s1=b.getStrExamCode1();
            String s2=b.getStrExamCode2();
            
            int n3=b.getNumericCode3();
            int n4=b.getNumericCode4();
            int max[]=b.getNumericExam();
            Answer answer=new Answer();
            answer.setStudent(b);
            
            answer.setReverseStringAnswer(xuly.daoxau(s1));
            
            answer.setNormalizationStringAnswer(xuly.chuanhoa(s2));
            
            answer.setUclnNumericAnswer(xuly.ucln(n3, n4));
            
            answer.setBcnnNumericAnswer(xuly.bcnn(n3, n4));
            
            answer.setMaxNumericAnswer(xuly.timmax(max));
            
            System.out.println(answer.toString());
            Answer answer1=ir.answer(answer);
            System.out.println(answer1.toString());
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
        } catch (RemoteException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
