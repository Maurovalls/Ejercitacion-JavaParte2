/*
 1.Desarrolle esta estructura completando atributos, métodos constructores e  implementación de la interface.
2.Vemos que las clases Vehículo, VehiculoTerrestre y VehiculoAereo son abstractas, 
------- publicabstractclassVehiculo{ …
Esto indica que tienen al menos un método sin implementar que es el que provee la interface Potencia: capacidad_max_de_carga(). 
Este debe ser implementado en las subclases Coche, Moto, Avión y Helicóptero. 
Cada uno tendrá un funcionamiento diferente, y todos deben tener tipo de devolución float.

3.Luego en la clase ejecutable: main()
a.Cree un objeto de cada subclase concreta (Coche, Moto, Avión y Helicoptero).
b.Muestre en pantalla la cantidad de ruedas de cada objeto, aclarando a qué vehículo se refiere.
c.Muestre en pantalla la cantidad de combustible de cada uno.
d.El método velociMaxima() tiene devolución float y debe estar implementado también en las subclases concretas.
e.Muestre en pantalla, el resultado de la ejecución de los métodos velocMaxima() y capacidad_max_de_carga(),
invocado desde cada uno de los objetos e indicando con un texto desde qué clase se ejecuta.

f.Invocando desde alguna clase, muestre todo el contenido del arreglo tipo_combustible. 
(Al ser static, se convierte en una constante de clase de toda la estructura de clases, 
inclusive se puede invocar con el nombre de la interface.
 */
package practicodosporgramacion2;

import javax.swing.JOptionPane;

public class PracticoDosPorgramacion2 {

    public static void main(String[] args) {
        Coche coche = new Coche('D',1500,4,2000);
        Moto moto = new Moto('G',1000,2,1200);
        Avion avion = new Avion('O',10000,50000,20000);
        Helicoptero helicoptero = new Helicoptero('Q',8000,30000,10000);
        menu(coche,moto,avion,helicoptero);
        
    }
    public static void menu(Coche coche, Moto moto, Avion avion, Helicoptero helicoptero){
        boolean empezar = true;
        while(empezar){
            int op = Integer.parseInt(JOptionPane.showInputDialog("OPCIONES:\n1-Cantidad de ruedas."
                    + "\n2-Cantidad de combustible.\n3-Velocidad maxima.\n4-Capacidad maxima de carga.\n5-Mostrar Combustibles."
                    + "\n6-Salir"));
            switch(op){
                case 1:
                    System.out.println("La cantidad de reudas del coche es de: "+coche.cantRuedas);
                    System.out.println("La cantidad de reudas de la moto es de: "+moto.cantRuedas);
                    break;
                case 2:
                    System.out.println("La cantidad de combustible del coche es de: "+coche.cantidadCombustible);
                    System.out.println("La cantidad de combustible de la moto es de: "+moto.cantidadCombustible);
                    System.out.println("La cantidad de combustible del avion es de: "+avion.cantidadCombustible);
                    System.out.println("La cantidad de combustible del helicoptero es de: "+helicoptero.cantidadCombustible);
                    break;
                case 3:
                    System.out.println("La velocidad maxima del coche es de: "+coche.VelocMax());
                    System.out.println("La velocidad maxima de la moto es de: "+moto.VelocMax());
                    System.out.println("La velocidad maxima del avion es de: "+avion.VelocMax());
                    System.out.println("La velocidad maxima del helicoptero es de: "+helicoptero.VelocMax());
                    break;
                case 4:
                    System.out.println("La capacidad maxima de carga del coche es de: "+coche.capacidad_max_carga());
                    System.out.println("La capacidad maxima de carga de la moto es de: "+moto.capacidad_max_carga());
                    System.out.println("La capacidad maxima de carga del avion es de: "+avion.capacidad_max_carga());
                    System.out.println("La capacidad maxima de carga del helicoptero es de: "+helicoptero.capacidad_max_carga());
                    break;
                case 5:
                    System.out.println("Los combustibles son:");
                    for(int i =0; i < Potencia.tipo_combustible.length; i++){
                        System.out.println((i+1)+")-"+Coche.tipo_combustible[i]);
                    }
                    break;
                case 6:
                    empezar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Error, ingreso un numero incorrecto!!");
                    break;
            }
        }
    }
    
}
