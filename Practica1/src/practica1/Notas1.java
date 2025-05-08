
package practica1;

public class Notas1 {
    public float[] notas;
    private int cantidad;
        
    public float[] getNotas(){
        return this.notas;
    }
    
    public int getCant() {
        return this.cantidad;
    }
    
    public void setCant(int cant) {
        this.cantidad = cant;
    }
    
    public void setNotas(float[] n) {
        this.notas = n;
    }
    
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
