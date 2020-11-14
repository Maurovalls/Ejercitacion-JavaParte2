/*
 Codifique una aplicación para almacenar en un ArrayList<Integer>
aleatoriamente 20 números enteros positivos pares del 1 al 100, de los
cuales se desea saber:
a) su promedio aritmético
b) cuántos de los números son iguales al promedio aritmético
c) cuántos de los números son mayores que el promedio aritmético
d) cuántos de los números son menores que el promedio aritmético
 */
package ejerciciotrestp6;

import java.util.ArrayList;

public class EjercicioTresTp6 {

    public static void main(String[] args) {
        Calculo c = new Calculo();
        double pro;
        ArrayList <Integer> numeros = new ArrayList <Integer>();
        Integer num;
        for(int i=0; i<20; i++){
            num = (int)(Math.random()*(1-100)+100);
            while(num % 2 != 0){
                num = (int)(Math.random()*(1-100)+100);
                if(num % 2 == 0){
                    numeros.add(num);
                    break;
                }
            }
            numeros.add(num);
        }
        c.mostrarNumeros(numeros);
        pro = c.promedio(numeros);
        System.out.println("El promedio de estos 20 numeros pares es: "+pro);
        System.out.println("La cantidad de numeros mayores al promedio es de: "+c.cuantosMayores(pro, numeros));
        System.out.println("La cantidad de numeros menores al promedio es de: "+c.cuantosMenores(pro, numeros));
    }
    
}
