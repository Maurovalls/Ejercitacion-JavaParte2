
package ejerciciotrestp6;

import java.util.ArrayList;

public class Calculo {
    
    public void mostrarNumeros(ArrayList <Integer> numeros){
        for(Integer n : numeros){
            System.out.println("["+n+"]");
        }
    }
    
    public double promedio(ArrayList <Integer> numeros){
        int suma = 0;
        double promedio;
        for(int i =0; i<numeros.size(); i++){
            suma += numeros.get(i);
        }
        promedio =(double)suma/numeros.size();
        return promedio;
    }
    
    public int cuantosMayores(double pro,ArrayList <Integer> numeros){
        int cantidad = 0;
        for(int i =0; i<numeros.size(); i++){
            if(numeros.get(i) > pro){
                cantidad++;
            }
        }
        return cantidad;
    }
    
    public int cuantosMenores(double pro,ArrayList <Integer> numeros){
        int cantidad = 0;
        for(int i =0; i<numeros.size(); i++){
            if(numeros.get(i) < pro){
                cantidad++;
            }
        }
        return cantidad;
    }
}
