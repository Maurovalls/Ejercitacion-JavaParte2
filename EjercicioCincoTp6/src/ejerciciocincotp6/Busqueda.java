
package ejerciciocincotp6;

import java.util.ArrayList;
import java.util.Iterator;

public class Busqueda {
    
    public void mostrar(ArrayList <Integer> numeros){
        System.out.println("La coleccion es: ");
        for(Integer n : numeros){
            System.out.println("["+n+"]");
        }
    }
    
    public void busquedaValor(ArrayList <Integer> numeros,int num){
        Iterator <Integer> it = numeros.iterator();
        int cont = 0;
        int cont2 = 0;
        while(it.hasNext()){
            cont++;
            if(it.next() == num){
                System.out.println("Se encontro el numero en la posicion : "+(cont-1));
                break;
            }else{
                cont2++;
            }           
        }
        if(cont2 == 10){
            System.out.println("No se encontro el numero deseado!!");
        }
        
    }
}
