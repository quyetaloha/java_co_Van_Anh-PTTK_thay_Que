/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 *
 * @author Hoang Quyet
 */
public class NewClass1 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//        ArrayList<HoaDon> li=new ArrayList();
//        li.add(new HoaDon("dsf", "afd", "asd", 5.6));
//        ObjectOutputStream s;
//        s = new ObjectOutputStream(new FileOutputStream("test.txt"));
//        s.writeObject(li);
        ArrayList<HoaDon> li=new ArrayList();
        li.add(new HoaDon("dsf", "afd", "asd", 5.6));
        ObjectInputStream s;
        s = new ObjectInputStream(new FileInputStream("test.txt"));
        li=(ArrayList<HoaDon>) s.readObject();
        System.out.println(li.get(0).getMa());
    }
}
