
package practicodosporgramacion2;

public abstract class Vehiculo implements Potencia {
    public char tipoCombustible;
    public float cantidadCombustible;

    public Vehiculo() {
    }

    public Vehiculo(char tipoCombustible, float cantidadCombustible) {
        this.tipoCombustible = tipoCombustible;
        this.cantidadCombustible = cantidadCombustible;
    }
    
    public abstract float VelocMax();
    
    
}
