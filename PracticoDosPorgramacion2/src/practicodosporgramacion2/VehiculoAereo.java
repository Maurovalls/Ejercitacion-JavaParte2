
package practicodosporgramacion2;

public abstract class VehiculoAereo extends Vehiculo {
    public float alturaVuelo;

    public VehiculoAereo() {
    }

    public VehiculoAereo(float alturaVuelo) {
        this.alturaVuelo = alturaVuelo;
    }
    
    public VehiculoAereo(char tipoCombustible, float cantidadCombustible, float alturaVuelo){
        super(tipoCombustible,cantidadCombustible);
        this.alturaVuelo = alturaVuelo;
    }
    
}
