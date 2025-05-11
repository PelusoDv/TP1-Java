
package practica1;

public class Notas {
    protected float[] notas;
    protected int cantidad;

    public Notas(){
    }
    
    public Notas(float[] notas, int cantidad) {
        this.notas = notas;
        this.cantidad = cantidad;
    }        
    
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
}
