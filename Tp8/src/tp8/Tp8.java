/*
El usuario ingresa un apellido. Si desea agregar uno más, presiona el botón “Otro apellido”. Si no lo desea, presionará el botón “Terminar”.
En el caso de “Otro apellido” debe ocurrir lo siguiente:
El apellido ingresado se guarda en una colección.
Se limpia la caja de texto donde ingresó el apellido anterior, dejando el lugar para el nuevo apellido, y así sucesivamente, hasta el último apellido.
Cuando presione Terminar, todos los apellidos ingresados hasta el momento, deben:
Guardarse en una colección.
Reflejarse en la caja de lista de la vista.
El usuario debe elegir alguno de los apellidos.
El apellido elegido debe mostrarse en la caja inferior.
Importante: cuando se activela caja de lista, el campo de texto donde se ingresaban los apellidos, debe dejar de ser editable.
Puede agregar imágenes u otras características al formulario.
Cree una clase, cuyo único atributo sea una colección.
Cree todo lo necesario para que la lista de apellidos de la vista se asigne a la colección de la clase.
Capture las excepciones que se podrían lanzar en forma espontánea.
Persista el objeto creado que contiene los apellidos.
Muestre el contenido del archivo guardado.

*/
package tp8;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

public class Tp8 {

    public static void main(String[] args) {

            Vista v=new Vista();
            Modelo m=new Modelo();
            Controlador c=new Controlador(v,m);
            c.iniciar();
            v.setVisible(true);
   
}
}