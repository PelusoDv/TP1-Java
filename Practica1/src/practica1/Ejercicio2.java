
package practica1;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 extends Notas{
    List<Float> n = new ArrayList<>();
    
    public List<Float> getN() {
        return n;
    }

    public void setN(float nota) {
        n.add(nota);
    }
    
    public int getAprov() {
        List<Float> aprov = new ArrayList<>();
        for (int i=0; i<this.cantidad; i++){
            if (this.n.get(i)>5){
                aprov.add(this.n.get(i));
            }
        }
        return aprov.size();
    }
    
    public int getDesapro() {
        List<Float> desapro = new ArrayList<>();
        for (int i=0; i<this.cantidad; i++){
            if (this.n.get(i)<6){
                desapro.add(this.n.get(i));
            }
        }
        return desapro.size();
    }
}
