
package practicodosporgramacion2;

public class Moto extends VehiculoTerrestre {
    public float capacidadMaxCarga;

    public Moto() {
    }

    public Moto(float capacidadMaxCarga) {
        this.capacidadMaxCarga = capacidadMaxCarga;
    }
    
    public Moto(char tipoCombustible, float cantidadCombustible, int cantRuedas, float capacidadMaxCarga){
        super(tipoCombustible,cantidadCombustible,cantRuedas);
        this.capacidadMaxCarga = capacidadMaxCarga;
    }

    @Override
    public float VelocMax() {
        return 180;
    }

    @Override
    public float capacidad_max_carga() {
        return capacidadMaxCarga;
    }
    
    
    
}
