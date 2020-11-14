
package ejerciciodostp6;

import java.util.ArrayList;

public class Calculo {
    
    public void mostrar(ArrayList <Double> decimales){
        System.out.println("Los numero almacenados en el Arrays son:");
        for(Double d : decimales ){
            System.out.println(d);
        }
    }
    
    public double mayor(ArrayList <Double> decimales){
        double aux = -1000;
        for(int i =0; i<decimales.size();i++){
            if(decimales.get(i) > aux ){
                aux = decimales.get(i);
            }
        }
        return aux;
    }
    
    public double menor(ArrayList <Double> decimales){
        double aux = 1000;
        for(int i =0; i<decimales.size();i++){
            if(decimales.get(i) < aux ){
                aux = decimales.get(i);
            }
        }
        return aux;
    }
    
}
