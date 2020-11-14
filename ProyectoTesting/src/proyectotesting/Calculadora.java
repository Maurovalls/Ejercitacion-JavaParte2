
package proyectotesting;

public class Calculadora {
    
      public int sumar(int a, int b){
      return a+b;
    }
    public int restar(int a, int b){
      return a-b;
    }
    public int multiplicar(int a, int b){
      return a*b;
    }



    public float dividir(float a, float b) throws Exception{

        if(b ==0) throw new Exception("NO SE PUEDE DIVIDIR POR 0!!!");

      return a/b;

    }
}

