
package practica1;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    private List<Float> notas = new ArrayList<>();
    
    public List<Float> getNotas() {
        return notas;
    }

    public void setNotas(float nota) {
        notas.add(nota);
    }
    
    public int getAprov() {
        List<Float> aprov = new ArrayList<>();
        for (int i=0; i<this.notas.size(); i++){
            if (this.notas.get(i)>=6){
                aprov.add(this.notas.get(i));
            }
        }
        return aprov.size();
    }
    
    public int getDesapro() {
        List<Float> desapro = new ArrayList<>();
        for (int i=0; i<this.notas.size(); i++){
            if (this.notas.get(i)<6){
                desapro.add(this.notas.get(i));
            }
        }
        return desapro.size();
    }
}
