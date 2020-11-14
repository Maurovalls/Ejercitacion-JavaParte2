/*
Declare una variable estática o de clase tipo String. Pida al usuario que ingrese allí su nombre . Cree cuatro métodos:
El primero que convierta a mayúscula la letra central del nombre, y el resto a minúscula y lo devuelva como un String. Cabe destacar, que sólo tendrán letra central algunas palabras. En aquéllas que no poseen letra central, no se hará nada.
El segundo que tome la letra convertida a mayúscula y devuelva el String “es vocal” o “es consonante.
El tercero que cuente la cantidad de vocales contenidas en el nombre completo y devuelva esa cantidad como un int.
El cuarto debe tomar nombre y colocarlo en una matriz de tres filas y la cantidad de columnas necesarias. Luego mostrará la matriz completa en forma rectangular.

Los métodos no deben recibir parámetros, ya que podrán usar sin problemas la variable, por ser de clase.
	
El método main debe pedir el nombre, y utilizar los métodos creados, mostrando los valores recibidos, excepto el cuarto método que los mostrará por sí mismo.

*/
package practica3;

import javax.swing.JOptionPane;

public class Practica3 {
    
    public static String nombre;
    public static char matriz[][],vector[];

    public static void main(String[] args) {
        
        nombre=JOptionPane.showInputDialog("Ingrese su nombre:");
        
        //llamamos todos los metodos
       System.out.println(convertirLetraCentral()); 
       System.out.println(vocal());
       System.out.println("La cantidad de vocales que tiene es de: "+cantidad());
       matrizNombre();
     
    }
    
    public static String convertirLetraCentral(){
         int c=nombre.length()/2;
         
         if(nombre.length()%2==0){
             return "No tiene letra central porque es par";
         }else{
             
             String n=nombre.substring(0, c)+nombre.substring(c,c+1).toUpperCase()+nombre.substring(c+1);
         
             return n;
         }
    }
    
    public static String vocal(){
        char c=nombre.charAt(nombre.length()/2);
        
        if(nombre.length()%2==0){
             return "No tiene letra central porque es par";
        }else{
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                return "Es vocal";
            }else{
                return "No es vocal";
            }
        }
    }
    
    public static int cantidad(){
        int cont=0;
        for(int i=0; i<nombre.length();i++){
            if(nombre.charAt(i) == 'a' || nombre.charAt(i) == 'e' || nombre.charAt(i) == 'i' || nombre.charAt(i) == 'o' || nombre.charAt(i) == 'u'){
                cont++;
            }
        }
        
        return cont;
    }
    
    public static void matrizNombre(){
        int columna;
        
        if(nombre.length()%3==0){
            columna=nombre.length()/3;

        }else{
            columna=(nombre.length()/3)+1;
            nombre=nombre +"."+" ";
        }
        
        matriz=new char[3][columna];
        vector=new char[nombre.length()];
        
        //llenamos el vector con el nombre
        for(int i=0; i<vector.length;i++){
            vector[i]=nombre.charAt(i);
        }
        //llenamos la matriz con el nombre y la mostramos
        int aux=0;
        for(int f=0; f<3; f++){
            for(int c=0; c<columna; c++ ){
                matriz[f][c]=vector[aux++];
                System.out.print("["+matriz[f][c]+"]");
            }
            System.out.println("");
            
        }
    }
    
}
