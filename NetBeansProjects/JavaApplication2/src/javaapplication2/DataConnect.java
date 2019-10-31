/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hoang Quyet
 */
public class DataConnect {
    public Connection con;
   private String dbClass="com.microsoft.sqlserver.jdbc.SQLServerDriver";
  public Connection getCon(){
        try {
            System.out.println("1");
            Class.forName(dbClass);
            System.out.println("Connect thanh cong");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
           ex.printStackTrace();
        }
        return con;
  }
}
