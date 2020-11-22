
package practicotresprogramacion2;

public class Asignatura {
    private String nombre;
    private char aula;
    private String hora;
    private Profesor profesor;
    private Grupo grupo;

    public Asignatura() {
    }

    public Asignatura(String nombre, char aula, String hora) {
        this.nombre = nombre;
        this.aula = aula;
        this.hora = hora;
    }

    public Asignatura(String nombre, char aula, String hora, Profesor profesor, Grupo grupo) {
        this.nombre = nombre;
        this.aula = aula;
        this.hora = hora;
        this.profesor = profesor;
        this.grupo = grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getAula() {
        return aula;
    }

    public void setAula(char aula) {
        this.aula = aula;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
    
}
