
package practica1;

public class Ejercicio1 extends Notas {
        
    public float getPromedio() {
        int i;
        float suma = 0;
        for (i=0;i<this.cantidad;i++) {
            suma = suma + this.notas[i];
        }
        return suma/this.cantidad;
    }
    
    public float getMayor() {
        int i;
        float mayor = 0;
        for (i=0;i<this.cantidad;i++) {
            if (this.notas[i]> mayor) {
                mayor = this.notas[i];
            }
        }
    return mayor;
    }
}
