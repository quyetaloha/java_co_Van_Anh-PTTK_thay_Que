/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hoang Quyet
 */
public class NewClass {
    public static void main(String[] args) throws SQLException {
//        String url="jdbc:sqlserver://DESKTOP-EBV3QLN\\SQLEXPRESS:1433;databaseName=test;user=sa;password=123";
//        Connection v = DriverManager.getConnection(url);
        JavaApplication4 c = new JavaApplication4();
        c.getCon();
    }
}
