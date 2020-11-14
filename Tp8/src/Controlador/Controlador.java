
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener ,java.io.Serializable{
    
    private Vista v;
    private Modelo m;
    
    public Controlador(Vista v, Modelo m){
        this.v=v;
        this.m=m;
        this.v.botonOtroApellido.addActionListener(this);
        this.v.botonComboBox.addActionListener(this);
        this.v.botonTerminar.addActionListener(this);
        this.v.botonHistorial.addActionListener(this);
    }
    
    public void iniciar(){
        v.setTitle("Trabajo practico 8");
        v.setLocationRelativeTo(null);
    }
    
    
    public void actionPerformed(ActionEvent e){

         //Ingresar mas apellidos
        if(e.getSource() == v.botonOtroApellido){
            
           m.getApellido().add(v.txtIngresoApellido.getText());
            
           v.txtIngresoApellido.setText("");
            
        }
        
        //Terminar de ingresar apellidos
        if(e.getSource() == v.botonTerminar){
            
            m.getApellido().add(v.txtIngresoApellido.getText());
            
            for(String ma: m.getApellido()){
                v.botonComboBox.addItem(ma.toString());
            }
            
            try {
                m.guardarApellidos();
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            v.txtIngresoApellido.setText("");
            v.txtIngresoApellido.setEditable(false);
          
           
            }
        
        // Elegir apellido del combo box
       if(e.getSource() == v.botonComboBox){
           v.txtResultado.setText("Usted elijio el apellido: "+v.botonComboBox.getSelectedItem().toString());
       }
       
      // Recuperar por consola los apellidos
      if(e.getSource() == v.botonHistorial){
           try{

            m.recuperarApellidos();
 
       }    catch (FileNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (EOFException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
    }
    
    }
}
