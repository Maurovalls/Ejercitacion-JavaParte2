
package practicodosporgramacion2;

public class Avion extends VehiculoAereo {
    public float capacidadMaxCarga;

    public Avion() {
    }

    public Avion(float capacidadMaxCarga) {
        this.capacidadMaxCarga = capacidadMaxCarga;
    }
    
    public Avion(char tipoCombustible, float cantidadCombustible, float alturaVuelo, float capacidadMaxCarga){
        super(tipoCombustible,cantidadCombustible,alturaVuelo);
        this.capacidadMaxCarga = capacidadMaxCarga;
    }

    @Override
    public float VelocMax() {
        return 800;
    }

    @Override
    public float capacidad_max_carga() {
        return capacidadMaxCarga;
    }
}
