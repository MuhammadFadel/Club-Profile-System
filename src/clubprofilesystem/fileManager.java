/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubprofilesystem;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Muhammad M Fadel
 */
public class fileManager {

    
    
    public static  void Write(Object object , String path)
    {
        ObjectOutputStream bin = null;
        try {
            bin = new ObjectOutputStream(new FileOutputStream(path));
        } catch (IOException ex) {
            Logger.getLogger(fileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bin.writeObject(object);
            bin.close();
        } catch (IOException ex) {
            Logger.getLogger(fileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    public static  Object read( String path)
    {
        ObjectInputStream bin = null;
        try {
            bin = new ObjectInputStream(new FileInputStream(path));
        } catch (IOException ex) {
            Logger.getLogger(fileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            try {
                return bin.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(fileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        } catch (IOException ex) {
            Logger.getLogger(fileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
         return null;
    }
    public static void Add(Object name,String pass)
    {
        ArrayList<Object> add=new ArrayList<>();
        add=(ArrayList<Object>)read(pass);
        add.add(name);
        Write(add, pass);
    }
    
    
}
