/*
Codifique las siguientes clases Java
Clase: Ingrediente
Atributos: nombre (string), cantidad(double), unidad de medida (string)
Clase: Plato
Atributos: nombreCompleto(string), precio (double), esBebida (boolean),
ArrayList de objetos Ingrediente
Clase: principal (clase que tendrá declarado el método main para
ejecutar el código.)

Lógica a Implementar:
En la clase principal debera declarar una variable “platosMenu” que
permita contener un conjunto de Platos que componen el menú de un
restaurant.

El algoritmo debe permitir cargar N platos y para cada plato indicar los N
ingredientes que lo componen. Si el plato es de tipo Bebida entonces no se
deben solicitar los ingredientes, en cambio si no lo es, será obligatorio que se
asigne al menos 1 ingrediente.
Al finalizar la carga de los platos y sus ingredientes mostrar la información
cargada, la cual será equivalente al menú del restaurant.

 */
package ejerciciodostp7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EjercicioDosTp7 {

    public static void main(String[] args) {
        ArrayList<Plato> platosMenu = new ArrayList<Plato>();
        cargarMenu(platosMenu);
        System.out.println("Menu del restaurante:");
        System.out.println("-------------------");
        System.out.println("-------------------");
        for(Plato p : platosMenu){
            p.mostrar();
            System.out.println("-------------------");
            System.out.println("-------------------");
        }
        

    }
    public static void cargarMenu(ArrayList <Plato> platosMenu){
        boolean bebida;
        Plato p;
        Ingrediente in;
        //
        boolean cargar = true;
        while(cargar){
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Opciones:\n1-Cargar plato.\n2-Salir"));
            switch(opcion){
                case 1:
                    int be = Integer.parseInt(JOptionPane.showInputDialog("Es bebida:\n1-SI.\n2-NO"));
                    if(be == 1){
                        String nombre = JOptionPane.showInputDialog("Ingrese nombre de la bebida:");
                        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio de la bebida:"));
                        p = new Plato(nombre,precio,true);
                        platosMenu.add(p);
                    }else if(be == 2){
                        String nombre = JOptionPane.showInputDialog("Ingrese nombre del plato:");
                        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del plato:"));
                        p = new Plato(nombre,precio,false);
                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos ingredientes tiene este plato:"));
                        while(cantidad <= 0){
                          cantidad = Integer.parseInt(JOptionPane.showInputDialog("Error,minimo un ingrediente:"));
                          if(cantidad >= 1){
                              break;
                          }
                        }
                        for(int i =0; i<cantidad; i++){
                            String nombreIn = JOptionPane.showInputDialog("Nombre del ingrediente numero "+(i+1)+" :");
                            double canti = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad del ingrediente numero "+(i+1)+" :"));
                            String unidadMedida = JOptionPane.showInputDialog("Unidad de medida del ingrediente numero "+(i+1)+" :");
                            in = new Ingrediente(nombreIn,canti,unidadMedida);
                            p.getIngredientes().add(in);
                        }
                        platosMenu.add(p);
                    }else{
                        JOptionPane.showMessageDialog(null,"Error, ingreso un numero incorrecto");
                    }
                    break;
                case 2:
                    cargar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Error, ingreso un numero incorrecto");
                    break;
            }
        }
    }
    
}
