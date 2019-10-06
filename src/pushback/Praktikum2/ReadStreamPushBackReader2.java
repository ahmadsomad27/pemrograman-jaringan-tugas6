/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pushback.Praktikum2;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Somad
 */
public class ReadStreamPushBackReader2 {
    public static void main(String[] args){
        try{
            File f = new File("coba.txt");
            PushbackReader reader = new PushbackReader(new FileReader(f));
            
            char[] words1 = new char[(int) f.length()];
            
            reader.read(words1);
            System.out.println(new String(words1));
            
            reader.unread((int) words1[6]);
            reader.read(words1);
            
            System.out.println(new String(words1));
            
        }catch(IOException ex){
            Logger.getLogger(ReadStreamPushBackReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}