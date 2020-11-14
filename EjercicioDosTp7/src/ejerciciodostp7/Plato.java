/*
Atributos: nombreCompleto(string), precio (double), esBebida (boolean),
ArrayList de objetos Ingrediente
 */
package ejerciciodostp7;

import java.util.ArrayList;

public class Plato {
    private String nombreCompleto;
    private double precio;
    private boolean esBebida;
    private ArrayList <Ingrediente> ingredientes = new ArrayList <Ingrediente>();

    public Plato() {
    }

    public Plato(String nombreCompleto, double precio, boolean esBebida) {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEsBebida() {
        return esBebida;
    }

    public void setEsBebida(boolean esBebida) {
        this.esBebida = esBebida;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+nombreCompleto);
        System.out.println("Precio: "+precio+" $");
        System.out.println("Ingredientes:");
        for(int i =0; i<ingredientes.size(); i++){
            System.out.println(ingredientes.get(i).getNombre());
            System.out.println(ingredientes.get(i).getCantidad());
            System.out.println(ingredientes.get(i).getUnidadDeMedida());
        }
    }
}
