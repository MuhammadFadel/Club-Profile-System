/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubprofilesystem;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Muhammad M Fadel
 */
public class ClubProfileSystem {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        // TODO code application logic here  
//        Player np;
//        Player nn;
        /*Team team = new Team("ElAhly");
        Date bd= new Date (2,11,2002);
        Date bb = new Date (11,11,1999);
        
        team.addPlayer("muhammad", "Ahmed", "333", 22.2, "sadasd", "asdas", "0111", "asd6",15,
                bd, bb, "player", "center", "11/11", "21/44", "elahly");
        
        
        nn= team.getPlayer("333");
        if(nn==null)System.out.println("not found");
        System.out.println(nn.getFirstName());
        
      //  Player player = team.getPlayer("222");
         
       // System.out.println(player.getFirstName() + " "+ player.getLastName()+"\n");
       */
        ArrayList<Object> mmm=new ArrayList<>();
        
//        fileManager.Write(mmm, "Time.bin");
//        Time KK = new Time();
//        KK.setTime(6, 8, 7);
//        fileManager.Add(KK, "Time.bin");
//        Time kk ;
//        mmm = (ArrayList<Object>)fileManager.read("Time.bin");
//        kk = (Time)mmm.get(0);
//        System.out.println(kk.toString());
               
//        fileManager.Write(mmm, "Player.bin");
//        fileManager.Write(mmm, "Player.bin");
//        Date d=new Date(10, 10, 10);
//        Date f=new Date(1, 1, 1);
//        Player ll = new Player("mm", "ll", "ii", 22.2, "sdad", "dsfsd", "011",
//                                "dfsd", 15, d, f, "asd",
//                                "fas", "fsdf", "asdd", "fds");
//        
//        System.out.println(ll.getFirstName());
//        System.out.println(ll.getEMail());
//        
//        fileManager.Add(ll, "Player.bin");
//        
//        Player j;
//        mmm= (ArrayList<Object>)fileManager.read("Player.bin");
//        j = (Player)mmm.get(0);
//        System.out.println(j.getFirstName());
//        
//        Player lll = new Player("sss", "ll", "ii", 22.2, "sdad", "dsfsd", "011",
//                                "dfsd", 15, d, f, "asd",
//                                "fas", "fsdf", "asdd", "fds");
//        
//        fileManager.Add(lll, "Player.bin");
//        mmm= (ArrayList<Object>)fileManager.read("Player.bin");
//        j = (Player)mmm.get(5);
//        System.out.println(j.getFirstName());
        ArrayList<Object> list = new ArrayList<>();
        fileManager.Write(list, "complainReplay.bin");
//        Team team = new Team("Elahly");
//        
//        team.addPlayer("asd", "asd", "sdsa", 22.2, "sad", "qw", "1210", "sdw",
//                15, f, f, "asds", "asdwd", "asddw", "sdw", "sadw");
//        team.addPlayer("ffffff", "asd", "bb", 22.2, "sad", "qw", "1210", "sdw",
//                15, f, f, "asds", "asdwd", "asddw", "sdw", "sadw");
//        ArrayList<Object> m= (ArrayList<Object>) fileManager.read("Player.bin");
//        Player p= (Player)m.get(0);
//        System.out.println(m);
//        p = team.getPlayer("bb");
//        System.out.println(p.getFirstName());
    }
}
    
