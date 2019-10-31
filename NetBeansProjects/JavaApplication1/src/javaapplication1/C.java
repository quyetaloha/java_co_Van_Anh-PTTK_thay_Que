/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.sql.*;
/**
 *
 * @author Hoang Quyet
 */
public class C {
    Connection cnn=null;
    public Connection getConnectDB(){
        
            try{
         //   String uRL="jdbc:sqlserver://DESKTOP-EBV3QLN\\SQLEXPRESS:1433;databaseName=bai1";
            String uRL="jdbc:sqlserver://DESKTOP-EBV3QLN\\SQLEXPRESS:1433;databaseName=test";
           
            String user="sa";
            String pass="123";
           // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                System.out.println("a");
            
          //  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cnn = DriverManager.getConnection(uRL, user, pass);
            System.out.println("Thanh cong !");
            } catch( Exception e){
                System.out.println("That bai !");
            }
        
        return cnn;
    }
}
