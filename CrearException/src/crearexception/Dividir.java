
package crearexception;

public class Dividir {
    
    public double division(double n, double m) throws ExceptionDivision{
        if(n == 0){
            throw new ExceptionDivision("No se puede dividir por cero");
        }else{
            return n / m;
        }
    }

 
}
