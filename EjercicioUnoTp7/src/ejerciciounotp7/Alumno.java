
package ejerciciounotp7;

import java.util.ArrayList;

public class Alumno {
    private String nombreCompleto;
    private long legajo;
    private ArrayList <Nota> notas = new ArrayList <Nota>();

    public Alumno() {
    }

    public Alumno(String nombreCompleto, long legajo) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre completo: "+nombreCompleto);
        System.out.println("Legajo: "+legajo);
        System.out.println("Notas:");
        for(Nota no : notas){
            System.out.print("["+no.getNotaExamen()+"]");
        }
        System.out.println(""); 
        //calculamos el promedio
        int suma = 0;
        double promedio;
        for(int i=0; i<notas.size(); i++){
            suma += notas.get(i).getNotaExamen();
        }
        promedio = (double)suma/notas.size();
        System.out.println("El promedio de sus notas es de: "+promedio);
    }
    
 
    
    
}
