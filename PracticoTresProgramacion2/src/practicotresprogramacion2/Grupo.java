
package practicotresprogramacion2;

import java.util.ArrayList;

public class Grupo {
    private String curso;
    private char letra;
    private ArrayList <Asignatura> asignaturas = new ArrayList <Asignatura>();
    private ArrayList <Alumno> alumnos = new ArrayList <Alumno>();

    public Grupo() {
    }

    public Grupo(String curso, char letra) {
        this.curso = curso;
        this.letra = letra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    
}
