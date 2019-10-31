/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hoang Quyet
 */
public class JavaApplication4 {
public Connection con;
     private final String dbClass="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    // private final String dbClass="com.mysql.jdbc.Driver";
     public Connection getCon(){
        try {
            System.out.println("1");
            Class.forName(dbClass);
            System.out.println("Connect thanh cong");
        } catch (ClassNotFoundException ex) {
            System.out.println("fail");
        }
        return con;
    }
    
}
