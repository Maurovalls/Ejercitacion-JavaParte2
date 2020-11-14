
package practicodosporgramacion2;

public abstract class VehiculoTerrestre extends Vehiculo {
    public int cantRuedas;

    public VehiculoTerrestre() {
    }

    public VehiculoTerrestre(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }
    
    public VehiculoTerrestre(char tipoCombustible, float cantidadCombustible,int cantRuedas){
        super(tipoCombustible,cantidadCombustible);
        this.cantRuedas = cantRuedas;
    }
    
}
