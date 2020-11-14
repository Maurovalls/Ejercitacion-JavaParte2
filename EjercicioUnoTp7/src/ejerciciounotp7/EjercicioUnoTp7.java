/*
Codifique las siguientes clases Java
Clase: Nota
Atributos: catedra (string), notaExamen(double)
Clase: Alumno
Atributos: nombreCompleto(string), legajo (long), ArrayList de objetos Nota
Lógica a Implementar:
En la clase main debera declarar una variable que permita contener un
conjunto de Alumnos:
Ejemplo:
ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
El algoritmo debe permitir cargar N cantidad de alumnos y para cada alumno N
cantidad de Notas. Al finalizar la carga de los alumnos y sus notas mostrar la
información cargada y para cada alumno mostrar el promedio de las notas que
posee. Valide que se ingrese al menos 1 nota. Agregue en la clase Alumno un
método público que calcule el promedio de las notas que posee.
 */
package ejerciciounotp7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EjercicioUnoTp7 {

    public static void main(String[] args) {
        iniciar();
                
    }
    public static void iniciar(){
        Alumno a;
        Nota n;
        ArrayList <Alumno> alumnos = new ArrayList <Alumno>();
        boolean empezar = true;
        while(empezar){
            int opciones = Integer.parseInt(JOptionPane.showInputDialog("Opciones:\n1-Cargar alumno.\n2-Salir."));
            switch(opciones){
                case 1:
                    a = new Alumno();
                    int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantas notas desea cargar:"));
                    while(cantidad <=0){
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Error, si o si tiene que cargar una nota, ingrese cantidad::"));
                        if(cantidad >=1){
                            break;
                        }
                    }
                    String nombre = JOptionPane.showInputDialog("Ingrese nombre completo del alumno:");
                    long legajo = Long.parseLong(JOptionPane.showInputDialog("Ingrese legajo del alumno:"));
                    a.setNombreCompleto(nombre);
                    a.setLegajo(legajo);                  
                    for(int i =0; i<cantidad; i++){
                        String catedra = JOptionPane.showInputDialog("Ingrese la catedra de la nota numero "+(i+1));
                        double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota numero "+(i+1)));
                        n = new Nota();
                        n.setNotaExamen(nota); 
                        n.setCatedra(catedra);
                        a.getNotas().add(n);
                    }
                    alumnos.add(a);
                    break;
                case 2:
                    empezar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error,ingreso un numero de opcion incorrecto.");
                    break;
            
            }
        }
    for(int i =0; i<alumnos.size();i++){
         alumnos.get(i).mostrarDatos();
        }
    }
}

