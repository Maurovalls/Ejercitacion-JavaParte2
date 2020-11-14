
package practicounoprogramacion2;

public class AvionPasajeros extends Nave {
    private int cantMaxPasj;

    public AvionPasajeros() {
    }

    public AvionPasajeros(int cantMaxPasj) {
        this.cantMaxPasj = cantMaxPasj;
    }
    
    public AvionPasajeros(String tipoNave, String tipoCombustible, float capacidadCombustible, int cantMaxPasj){
        super(tipoNave,tipoCombustible,capacidadCombustible);
        this.cantMaxPasj = cantMaxPasj;
    }

    public int getCantMaxPasj() {
        return cantMaxPasj;
    }

    public void setCantMaxPasj(int cantMaxPasj) {
        this.cantMaxPasj = cantMaxPasj;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("Tipo de nave: "+tipoNave);
        System.out.println("Tipo de combustible: "+tipoCombustible);
        System.out.println("Capacidad de combustible: "+capacidadCombustible);
        System.out.println("Cantidad maxima de pasajeros: "+cantMaxPasj);
    }
    
}
