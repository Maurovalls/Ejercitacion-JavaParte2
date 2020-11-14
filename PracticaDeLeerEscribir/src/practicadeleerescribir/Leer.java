// Escribir y leer ficheros de texto
package practicadeleerescribir;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leer {
    
    
 public void leerFicheros() throws FileNotFoundException, IOException{
     
    String cadena=" ";
    
    try{
    
    FileReader lectura=new FileReader("texto.txt"); // indicamos el archivo a leer
    
    BufferedReader objetoLector=new BufferedReader(lectura); //creamos el objetolector
    
    while((cadena=objetoLector.readLine()) != null){
        System.out.println(cadena);
     }
    
    }catch(FileNotFoundException ex){
        ex.getMessage();
    }catch(IOException exx){
        exx.getMessage();
    }
    
 }
    
}
