/*
Cree un ArrayList<Integer>, alamacenar los valores numéricos
(los que tú quieras) hasta ingresar un valor menor a 0,
mostrar los números por pantalla. 
 */
package ejerciciouno;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EjercicioUno {

    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList <Integer>();
        asignar(numeros);
        
    }
    public static void asignar(ArrayList <Integer> numeros){
        boolean comenzar=true;
        while(comenzar){
            Integer num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
            if(num >= 0){
            numeros.add(num);
            }else{
                comenzar = false;
            }
            
        }
        for(int i =0; i<numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
    }
    
}
