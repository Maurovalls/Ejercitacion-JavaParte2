/*
 Codifique una aplicación que:
a) lea 20 números decimales ingresados por teclado por el usuario y los
coloque en un ArrayList<Double>.
b) determine y muestre el mayor de los números en el arreglo
c) determine y muestre el menor de los números del arreglo calcule y
muestre el rango (diferencia entre el mayor y el menor) de los
elementos en el arreglo 
 */
package ejerciciodostp6;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EjercicioDosTp6 {

    public static void main(String[] args) {
        ArrayList <Double> decimales = new ArrayList <Double>();
        for(int i =0; i<20; i++){
            Double num = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero:"));
            decimales.add(num);
        }
        Calculo c=new Calculo();
        c.mostrar(decimales);
        System.out.println("La diferencia es de : "+(c.mayor(decimales)-c.menor(decimales)));
            
        }
    }
    

