
package conviertegradoscontrol7;

import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

public class Modelo implements java.io.Serializable {
    private double gradoC,resultado;
    public ArrayList <Modelo> lista=new ArrayList <Modelo>();

    public Modelo() {
    }

    public Modelo(double gradoC, double resultado) {
        this.gradoC = gradoC;
        this.resultado = resultado;
    }


    public double getGradoC() {
        return gradoC;
    }

    public void setGradoC(double gradoC) {
        this.gradoC = gradoC;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    
    
    public double gradoFa(){
        return (gradoC*9/5)+32;
}
    
    
    public void GuardarEnArreglo(Modelo model){
        lista.add(model);   
        JOptionPane.showMessageDialog(null, "Se guardo correctamente");
    }
    
    
}

    
    
 

    
    

