/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect_database;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hoang Quyet
 */
public class Test {
    
    public static void main(String[] args){
        Connect_database kn=new Connect_database();
        Connection con = kn.getConnectDB();
       
        try {
            ArrayList<String> dsCombo = new ArrayList<>();
            PreparedStatement ps = null;
            String sql="SELECT * FROM login";
            ps=con.prepareStatement(sql);
            // gan ket qua tra ve
            ResultSet rs = ps.executeQuery();
            //gan vao mang
            while(rs.next()){
                String id=rs.getString("id");//id.trim();
                String name =rs.getString("name");//name.trim();
                String pass =rs.getString("pass");//pass.trim();
                String d=id+name+pass;
                dsCombo.add(d);
                
            }
            System.out.println("get data combo success "+dsCombo.size());
            for(String s:dsCombo){
                System.out.println(s);
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            System.out.println("error!");
        }
      
        
    }
}
