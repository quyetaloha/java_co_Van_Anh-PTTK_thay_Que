/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Hoang Quyet
 */
public class NewClass {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://live.lobbyplay.com/game/game-poker/play.php?id=CQm6znFxpn7uLyfgwX8S%2FqBJVefoEYH4yvqG%2FJPeH20Xy3Z%2F3nya%2FU57avVnQ0fz");
            URLConnection con=url.openConnection();
            InputStream in=con.getInputStream();
            BufferedReader re=new BufferedReader(new InputStreamReader(in));
            String s=re.readLine();
            String kq="";
            while(s!=null){
                kq+=s+'\n';
                s=re.readLine();
            }
            System.out.println(kq);
        } catch (Exception e) {
        }

    }
}
