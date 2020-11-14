/*
Empleando la clase HashMap()(con un String de clave y un entero largo de valor) implemente una
agenda de teléfonos.
El algoritmo debe contener un menú inicial con 3 opciones
1- Cargar Datos en la Agenda
2- Buscar Teléfono por Nombre
3- Listar Agenda

El usuario deberá elegir que desea hacer:
Cargar Datos en la Agenda
Debe solicitar el nombre completo de la persona y su respectivo teléfono, el nombre será usado
como clave y el teléfono como valor del HashMap.
Se deben poder solicitar todas las personas que se deseen hasta que se indique que no se quiere
seguir cargando.

Buscar Teléfono por Nombre
Se debe solicitar el nombre de la persona a buscar, si no se encuentra mostrar el mensaje “La
persona buscada no se encuentra en la agenda”, caso contrario mostrar por pantalla el teléfono de
la persona que se encontró en el HashMap. Al finalizar mostrar nuevamente el menú.

Listar Agenda
Recorrer la totalidad de elementos que posee el HashMap agenda, mostrando cada uno de los
nombres y teléfonos que se encuentran almacenados. Al finalizar volver al menú.

 */
package ejerciciounotp8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;

public class EjercicioUnoTp8 {

    public static void main(String[] args) { 
        Proceso p = new Proceso();
       HashMap<String, Long> agenda = new HashMap<String, Long>();
       Iterator it2 = null ;
       menu(agenda,p,it2);
          
       }
        public static void menu(HashMap<String, Long> agenda,Proceso p,Iterator it2){
            boolean iniciar = true;
       while(iniciar){
            it2 = agenda.entrySet().iterator();
           int opciones = Integer.parseInt(JOptionPane.showInputDialog("Opciones:\n1-Cargar Datos de la Agenda."
                   + "\n2-Buscar Telefono por Nombre.\n3-Listar Agenda.\n4-Salir"));
           switch(opciones){
               case 1:
                   p.cargarDatos(agenda);

                   break;
               case 2:
                   p.buscarTelefono(agenda);

                   break;
               case 3:
                   p.mostrarAgenda(agenda);

                   break;
               case 4:
                   iniciar = false;
                   break;
               default:
                   JOptionPane.showMessageDialog(null,"Error, ingreso un numero incorrecto.");
                   break;
           }
       }

    }
}
    

