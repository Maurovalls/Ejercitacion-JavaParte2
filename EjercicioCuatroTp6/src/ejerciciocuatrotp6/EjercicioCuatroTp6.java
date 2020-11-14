/*
 Codifique una aplicación que permita almacenar palabras en un
ArrayList<String> hasta que se ingrese la palabra “salir”, al finalizar
muestre por pantalla:
a) Las palabras ingresadas
b) Indicar cuál de las palabras ingresadas posee más caracteres
c) Indicar si se ingresaron o no palabras iguales o repetidas
d) Mostrar las palabras repetidas ingresadas
 */
package ejerciciocuatrotp6;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EjercicioCuatroTp6 {

    public static void main(String[] args) {
        Calculo calculo = new Calculo();
        ArrayList <String> palabrasRepetidas = new ArrayList <String>();
        String p;
        boolean comenzar = true;
        int cont=0;
        while(comenzar){
            p = JOptionPane.showInputDialog("Ingrese una palabra:");
            String repetido="";          
            for(int i =0; i<calculo.getPalabras().size(); i++){
                if(p.equals(calculo.getPalabras().get(i))){
                    repetido = p;
                    palabrasRepetidas.add(repetido);
                    cont++;
                }
            }
            if (!p.equals("salir")){
                calculo.getPalabras().add(p);
            }
            if(p.equals("salir")){
                comenzar = false;
            }
            
        }
        
        //a)
        for(String pala : calculo.getPalabras()){
            System.out.println("-"+pala);
        }
        
        //b) Cual tiene mas caracteres
        int aux = -100;
        String palabra= "";
        String masGrande= "";
        for(int i = 0; i<calculo.getPalabras().size(); i++){
           palabra = calculo.getPalabras().get(i);
           if(palabra.length() > aux){
               aux = palabra.length();
               masGrande = palabra;
           }
            
        }
        System.out.println("La palabra con mas caracteres es: "+masGrande);
        //c)Iguales?
       if(cont > 0){
                System.out.println("Se repitieron palabras");
            }else{
                System.out.println("No se repitieron apalabras");
            }
       
       
       //d)
       System.out.println("Las palabras repetidas son:");
       for(int i = 0; i<palabrasRepetidas.size(); i++){
           System.out.println(palabrasRepetidas.get(i));
       }
        
        
    }
    
}
