
package practicadeleerescribir;

import java.io.FileWriter;
import java.io.IOException;

public class PracticaDeLeerEscribir {

    public static void main(String[] args) throws IOException {
        
     String dias="Lunes\nMartes\nMiercoles\nJueves\nViernes\nSabado\nDomingo\nViva la pepa";
     
     try{
     
     FileWriter archivo=new FileWriter("texto.txt"); //creamos archivo
     
     archivo.write(dias);// escribimos los dias en el archivo
     
     archivo.close();// cerramos archivo
     
     
     }catch(IOException e){
         System.out.println("Error: "+e.getMessage());
     }
     
    Leer l=new Leer();
    l.leerFicheros();
    }
    
}
