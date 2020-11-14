/*
Realice una búsqueda secuencial en un ArrayList<Integer> que contenga
10 elementos generados aleatoriamente mediante la función java random.
Realice una búsqueda secuencial de la siguiente forma:
- ingresar el valor que se desea buscar,
- se compara la primera posición;
- si son iguales,
- fin de la búsqueda.
- De lo contrario, compararlo con la segunda posición, y así
sucesivamente.
- Si se llega al final del arreglo y no se encontró el valor, debe indicarlo
con un mensaje apropiado.
- Si se encuentra, se debe especificar la posición que ese valor ocupa en
la lista por primera vez. 
 */
package ejerciciocincotp6;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EjercicioCincoTp6 {

    public static void main(String[] args) {
        Busqueda b = new Busqueda();
        ArrayList <Integer> numeros = new ArrayList();
        Integer num;
        for(int i =0; i<10; i++){
            num = (int)(Math.random()*(1-20)+20);
            numeros.add(num);
        }       
        b.mostrar(numeros);
        int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desea buscar:"));
        b.busquedaValor(numeros, buscar);
    }
    
}
