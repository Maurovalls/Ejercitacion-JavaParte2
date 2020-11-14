
package Modelo;

import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

public class Modelo implements java.io.Serializable {
    
   private ArrayList <String> apellido=new ArrayList <String>();

    public ArrayList<String> getApellido() {
        return apellido;
    }

    public void setApellido(ArrayList<String> apellido) {
        this.apellido = apellido;
    }
    
    
    public void guardarApellidos()throws FileNotFoundException,IOException{
        
        try{
        
            FileOutputStream f=new FileOutputStream("apellido.txt");
            
            ObjectOutputStream escribirFichero=new ObjectOutputStream(f);
            
            escribirFichero.writeObject(apellido);
            
            JOptionPane.showMessageDialog(null,"Se guardo los apellidos correctamente en el archivo");
            
            escribirFichero.close();
            
            
            
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"Error, no se encontro el archivo");
            e.getMessage();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error a guardar");
            ex.getMessage();
        }
        
    }
    
    
    public void recuperarApellidos()throws FileNotFoundException, IOException,
ClassNotFoundException,EOFException{
        
        FileInputStream r=new FileInputStream("apellido.txt");
        
        ObjectInputStream leerApellidos=new ObjectInputStream(r);
        
        
        ArrayList <String> leer= (ArrayList <String>) leerApellidos.readObject();
        
        

        for(String l: leer){
            System.out.println("Apellidos: "+l);
            
        }
        
        leerApellidos.close();
        }
        
        
       
    }
    
 
    

   

