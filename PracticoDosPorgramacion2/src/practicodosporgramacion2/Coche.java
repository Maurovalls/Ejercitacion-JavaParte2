
package practicodosporgramacion2;

public class Coche extends VehiculoTerrestre {
    public float capacidadMaxCarga;

    public Coche() {
    }

    public Coche(float capacidadMaxCarga) {
        this.capacidadMaxCarga = capacidadMaxCarga;
    }
    
    public Coche(char tipoCombustible, float cantidadCombustible, int cantRuedas, float capacidadMaxCarga){
        super(tipoCombustible,cantidadCombustible,cantRuedas);
        this.capacidadMaxCarga = capacidadMaxCarga;
    }

    @Override
    public float VelocMax() {
        return 200;

    }

    @Override
    public float capacidad_max_carga() {
        return capacidadMaxCarga;
    }


}
