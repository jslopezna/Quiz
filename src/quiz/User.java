/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public abstract class User {
    private int id; 
    private String nombre; 
    private String Nickname; 

    public User(int id, String nombre, String Nickname) {
        this.id = id;
        this.nombre = nombre;
        this.Nickname = Nickname;
    }
 void archivos(String nombreArtista ) throws Exception{
      // String file = nombreArtista[0];
        DataInputStream din = new DataInputStream(new FileInputStream(nombreArtista));
        String data;
        char a;
         try{
            while (true ){
               
                    
                data = din.readLine();
                System.out.println(data);
                
            }
        }
        catch (EOFException eofe){}
        din.close();}
// la funcion lee el archivo pero no para.  


 void nombreArtista (String nombreArtista) throws FileNotFoundException, IOException{
     
     DataInputStream din = new DataInputStream(new FileInputStream(nombreArtista));
        String data = null;
         try{
            while (data.equals(nombreArtista)){
                
                data = din.readLine();
                System.out.println(data);
                
            }
        }
        catch (EOFException eofe){}
        din.close();}
     
 

        
       
    
  
   
        
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNickname() {
        return Nickname;
    }
    
    
    
}
