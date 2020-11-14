
package practicodosporgramacion2;

public class Helicoptero extends VehiculoAereo {
    public float capacidadMaxCarga;

    public Helicoptero() {
    }

    public Helicoptero(float capacidadMaxCarga) {
        this.capacidadMaxCarga = capacidadMaxCarga;
    }
    
    public Helicoptero(char tipoCombustible, float cantidadCombustible, float alturaVuelo, float capacidadMaxCarga){
        super(tipoCombustible,cantidadCombustible,alturaVuelo);
        this.capacidadMaxCarga = capacidadMaxCarga;
    }

    @Override
    public float VelocMax() {
        return 400;
    }

    @Override
    public float capacidad_max_carga() {
        return capacidadMaxCarga;
    }
}
