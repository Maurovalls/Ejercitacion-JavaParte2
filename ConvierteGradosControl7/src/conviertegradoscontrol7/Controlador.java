
package conviertegradoscontrol7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controlador implements ActionListener ,java.io.Serializable{
    private Vista vista;
    private Modelo modelo;
    
    public Controlador(Vista vista,Modelo modelo){
        this.vista=vista;
        this.modelo=modelo;
        vista.botonCalcular.addActionListener(this);
        vista.botonGuardarEnArreglo.addActionListener(this);
    }
    
    public void iniciar(){
      vista.setTitle("Conversion");
      vista.setLocationRelativeTo(null);
    }
    
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== vista.botonCalcular){
        modelo.setGradoC(Double.parseDouble(vista.txtGradoC.getText()));
        modelo.setResultado(modelo.gradoFa());
        vista.txtResultado.setText((String.valueOf(modelo.getResultado())));
        }

        
        if(e.getSource()== vista.botonGuardarEnArreglo){
             modelo.setGradoC(Double.parseDouble(vista.txtGradoC.getText()));
            modelo.setResultado(modelo.gradoFa());
            Modelo m1=new Modelo(modelo.getGradoC(),modelo.getResultado());
            modelo.GuardarEnArreglo(m1);
        }
        }
    }

