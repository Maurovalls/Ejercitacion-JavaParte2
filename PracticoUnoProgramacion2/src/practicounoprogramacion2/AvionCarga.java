
package practicounoprogramacion2;

public class AvionCarga extends Nave {
    private float cantMaxKG;

    public AvionCarga() {
    }

    public AvionCarga(float cantMaxKG) {
        this.cantMaxKG = cantMaxKG;
    }
    
    public AvionCarga(String tipoNave, String tipoCombustible, float capacidadCombustible, float cantMaxKG){
        super(tipoNave,tipoCombustible,capacidadCombustible);
        this.cantMaxKG = cantMaxKG;
    }

    public float getCantMaxKG() {
        return cantMaxKG;
    }

    public void setCantMaxKG(float cantMaxKG) {
        this.cantMaxKG = cantMaxKG;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Tipo de nave: "+tipoNave);
        System.out.println("Tipo de combustible: "+tipoCombustible);
        System.out.println("Capacidad de combustible: "+capacidadCombustible);
        System.out.println("Cantidad maxima de kilogramos: "+cantMaxKG);
    }
    
    
}
