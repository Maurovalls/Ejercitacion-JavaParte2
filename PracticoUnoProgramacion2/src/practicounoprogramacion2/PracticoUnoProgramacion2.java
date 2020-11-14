/*
Realice lo siguiente:

Cada clase debe tener dos constructores sobrecargados.
Las subclases deben usar en sus constructores al menos uno (1) sobrecargado de la superclase.
Implemente los métodos set y get, sólo los necesarios.
Convierta la clase Nave en abstracta.
Cree una clase donde el método main cree un objeto con cada constructor.
Usando su imaginación, cree un nuevo método en la clase Nave, definido.
Invocar al método creado.
Muestre los atributos de cada clase, inclusive los heredados.
Active los métodos heredados, desde objetos diferentes, es decir, de objetos de las subclases y muestre el resultado.

 */
package practicounoprogramacion2;

public class PracticoUnoProgramacion2 {

    public static void main(String[] args) {
        AvionCarga avionCarga = new AvionCarga("A12","Diessel",200000,10000);
        AvionPasajeros avionPasajeros = new AvionPasajeros("B14","Diessel",15000,100);
        avionCarga.mostrarDatos();
        System.out.println("-----------");
        avionPasajeros.mostrarDatos();
    }
    
}
