
package practicounoprogramacion2;

public abstract class Nave {
    public String tipoNave;
    public String tipoCombustible;
    public float capacidadCombustible;

    public Nave() {
    }

    public Nave(String tipoNave, String tipoCombustible) {
        this.tipoNave = tipoNave;
        this.tipoCombustible = tipoCombustible;
    }

    public Nave(String tipoNave, String tipoCombustible, float capacidadCombustible) {
        this.tipoNave = tipoNave;
        this.tipoCombustible = tipoCombustible;
        this.capacidadCombustible = capacidadCombustible;
    }
    
    public void mostrarDatos(){
        System.out.println("Tipo de nave: "+tipoNave);
        System.out.println("Tipo de combustible: "+tipoCombustible);
        System.out.println("Capacidad de combustible: "+capacidadCombustible);
    }
    
}
