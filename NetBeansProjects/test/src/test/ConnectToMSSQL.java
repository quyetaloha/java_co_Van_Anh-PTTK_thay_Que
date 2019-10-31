/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Hoang Quyet
 */
public class ConnectToMSSQL {
    Connection connection;
    public Connection getConnectToMSSQL(){
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch(ClassNotFoundException ex){
            Logger.getLogger(ConnectToMSSQL.class.getName()).log(Level.SEVERE,null,ex);System.out.println("a");
        }
        try{
            connection= DriverManager.getConnection("jdbc:sqlserver://DESKTOP-EBV3QLN\\SQLEXPRESS:1433;databaseName=test","sa","123");
            
        } catch(SQLException ex){
            Logger.getLogger(ConnectToMSSQL.class.getName()).log(Level.SEVERE,null,ex);
        }
        return connection;
    }
}
