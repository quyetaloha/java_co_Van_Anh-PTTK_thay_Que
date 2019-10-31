/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.sql.*;
/**
 *
 * @author Hoang Quyet
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConnectToMSSQL s= new ConnectToMSSQL();
        Connection con = s.getConnectToMSSQL();
        
    }
    
}
