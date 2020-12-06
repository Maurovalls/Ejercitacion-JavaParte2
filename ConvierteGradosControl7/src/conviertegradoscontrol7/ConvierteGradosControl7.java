
package conviertegradoscontrol7;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ConvierteGradosControl7 {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
    Vista v= new Vista();
    Modelo m=new Modelo();
    v.setVisible(true);
    Controlador c= new Controlador(v,m);
    c.iniciar();
    v.setVisible(true);
    }
}
    

