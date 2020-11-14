
package ejerciciounotp8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;

public class Proceso {
    
    public void cargarDatos(HashMap <String, Long> agenda){
        int cont1 = 0;
        Iterator it1 = agenda.entrySet().iterator();
        String nombre = JOptionPane.showInputDialog("Ingrese nombre:");
        long telefono = Long.parseLong(JOptionPane.showInputDialog("Ingrese telefono:"));                  
        agenda.put(nombre, telefono);                                              
    }
    
    public void buscarTelefono(HashMap <String, Long> agenda){
        int cont2 = 0;
        Iterator it2 = agenda.entrySet().iterator();
        String n = JOptionPane.showInputDialog("Ingrese el nombre:");
        while(it2.hasNext()){
        Map.Entry e = (Map.Entry) it2.next();
        if(e.getKey().equals(n)){
            System.out.println(e.getValue());
             cont2++;                           
        }
        }
        if(cont2 == 0){
            System.out.println("La persona buscada no se encuentra en la agenda");
        }
    }
    
    public void mostrarAgenda(HashMap <String, Long> agenda){
        System.out.println("Agenda:");
        System.out.println("-------------------");
        for(Map.Entry<String,Long> a : agenda.entrySet()){
           String clave = a.getKey();
           Long numero = a.getValue();
           System.out.println("Nombre: "+clave);
           System.out.println("Numero: "+numero);
           System.out.println("----------------");
        }
        
    }
    
}
