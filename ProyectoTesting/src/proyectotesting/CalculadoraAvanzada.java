
package proyectotesting;

public class CalculadoraAvanzada {
    
    public double raizCuadrada(int a){
        return Math.sqrt(a);
    }
    
    public double raizCubica(int a){
        return Math.cbrt(a);
    }
    
    public double cuadrado(int a){
        return Math.pow(a, 2);
    }
    
    public double inversoMultiplicativo(int a){
        double inverso=0;
        inverso=Math.pow(a,-1);
        return inverso;
        
    }
}
