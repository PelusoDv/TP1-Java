
package practica1;

public class Ejercicio1 {
    protected float[] notas;
    
    public float[] getNotas(){
        return this.notas;
    }
    
    public void setNotas(float[] n) {
        this.notas = n;
    } 
        
    public float getPromedio() {
        float suma = 0;
        for (int i=0;i<this.notas.length;i++) {
            suma = suma + this.notas[i];
        }
        return suma/this.notas.length;
    }
    
    public float getMayor() {
        float mayor = 0;
        for (int i=0;i<this.notas.length;i++) {
            if (this.notas[i]> mayor) {
                mayor = this.notas[i];
            }
        }
    return mayor;
    }
}
