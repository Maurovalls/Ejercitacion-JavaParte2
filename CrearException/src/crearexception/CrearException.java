/*
 Cree una exception que diga "No se puede dividir por cero" y  piense en que la puede aplicar.
 */
package crearexception;

import javax.swing.JOptionPane;

public class CrearException {

    public static void main(String[] args) throws ExceptionDivision {
        Dividir d = new Dividir();
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primero numero:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
        try{
        System.out.println(d.division(num1, num2));
        }catch(ExceptionDivision e){
            System.out.println(e.getMessage());
        }
    }
    
}
