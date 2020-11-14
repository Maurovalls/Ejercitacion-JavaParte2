
package proyectotesting;

public class Burbuja {

 public double[] ordena(){
       int cant = 1000;
       double resultado[] = new double[cant];

       //llenar el arreglo
       for(int i=0; i<cant; i++)
           resultado[ i ] = Math.random();

       //ordenar el resultado
       for(int i=0; i<cant; i++)
           for(int j=i; j<cant;j++)
               if(resultado[i]>resultado[j])     //intercambio
               {
                   double aux = resultado[i];
                   resultado[ i ] = resultado[j];
                   resultado[ j ] = aux;
               }

       return resultado;
    }
}
