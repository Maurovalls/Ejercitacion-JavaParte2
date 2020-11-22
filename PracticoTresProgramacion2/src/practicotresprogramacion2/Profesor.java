
package practicotresprogramacion2;

import java.util.ArrayList;

public class Profesor {
    private String nombre;
    private int dni;
    private String departamento;
    private ArrayList <Asignatura> imparte = new ArrayList <Asignatura>();

    public Profesor() {
    }

    public Profesor(String nombre, int dni, String departamento) {
        this.nombre = nombre;
        this.dni = dni;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Asignatura> getImparte() {
        return imparte;
    }

    public void setImparte(ArrayList<Asignatura> imparte) {
        this.imparte = imparte;
    }
    
    
    
}
