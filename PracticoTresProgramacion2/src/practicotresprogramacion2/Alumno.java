
package practicotresprogramacion2;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private int dni;
    private ArrayList <Grupo> grupos = new ArrayList <Grupo>();

    public Alumno() {
    }

    public Alumno(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
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

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }
    
    
    
}
