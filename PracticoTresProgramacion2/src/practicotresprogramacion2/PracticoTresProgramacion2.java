/*
A.Cree todas las clases del modelo, con todos los métodos necesarios. 
Las multiplicidades mayores a 1 se representarán con colecciones.
B.Complete un objeto de cada clase, asignando algún valor a todos sus atributos, inclusive los de relación.
C.Realice las siguientes operaciones sobre el modelo:
1)Teniendo un objeto de Profesor, muestre las aulas de la asignatura que tenga.
2)Teniendo un profesor, muestre el grupo de la asignatura, identificado por su letra.
3)Teniendo una asignatura, muestre nombre y dni de los alumnos del grupo que recibe.
4)Teniendo un alumno, muestre la letra del grupo al que pertenece.
5)Teniendo un alumno, muestre la asignatura recibida por el grupo al que pertenece.
6)Teniendo un alumno, muestre el nombre del profesor que imparte la asignatura que cursa el alumno.
 */
package practicotresprogramacion2;

public class PracticoTresProgramacion2 {

    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Gustavo",301234567,"Ingenieria");
        Asignatura asignatura1 = new Asignatura("Matematica",'A',"16hs");
        Alumno alumno1 = new Alumno("Mauro",36134543);
        Grupo grupo1 = new Grupo("Primero",'A');
        
        //Relaciones
        profesor1.getImparte().add(asignatura1);
        asignatura1.setProfesor(profesor1);
        asignatura1.setGrupo(grupo1);
        grupo1.getAsignaturas().add(asignatura1);
        grupo1.getAlumnos().add(alumno1);
        alumno1.getGrupos().add(grupo1);
        
        //1)
        puntoUno(profesor1);
        //2)
        puntoDos(profesor1);
        //3)
        puntoTres(asignatura1);
        //4)
        puntoCuatro(alumno1);
        //5)
        puntoCinco(alumno1);
        //6)
        puntoSeis(alumno1);
    }
    
    public static void puntoUno(Profesor profesor1){
        System.out.println("----Punto 1----");
        System.out.println("El aula que tiene el profesor "+profesor1.getNombre()+" es: "+profesor1.getImparte().get(0).getAula());
    }
    
    public static void puntoDos(Profesor profesor1){
        System.out.println("----Punto 2----");
        System.out.println("El grupo que tiene el profesor "+profesor1.getNombre()+" es: "
                +profesor1.getImparte().get(0).getGrupo().getLetra());
    }
    
    public static void puntoTres(Asignatura asignatura1){
        System.out.println("----Punto 3----");
        for(int i = 0; i < asignatura1.getGrupo().getAlumnos().size(); i++){
            System.out.println("Nombre: "+asignatura1.getGrupo().getAlumnos().get(i).getNombre());
            System.out.println("DNI: "+asignatura1.getGrupo().getAlumnos().get(i).getDni());
        }
    }
    
    public static void puntoCuatro(Alumno alumno1){
        System.out.println("----Punto 4----");
        System.out.println("La letra del grupo que pertenece el alumno "+alumno1.getNombre()+" es: "
                +alumno1.getGrupos().get(0).getLetra());
        
    }
    
    public static void puntoCinco(Alumno alumno1){
        System.out.println("----Punto 5----");
        System.out.println("El alumno "+alumno1.getNombre()+" pertenece a la asignatura: "
                +alumno1.getGrupos().get(0).getAsignaturas().get(0).getNombre());
    }
    
    public static void puntoSeis(Alumno alumno1){
        System.out.println("----Punto 6----");
        System.out.println("El alumno "+alumno1.getNombre()+" tiene como profesor a : "
                +alumno1.getGrupos().get(0).getAsignaturas().get(0).getProfesor().getNombre());
    }
    
}
