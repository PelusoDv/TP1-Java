
package practica1;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    private List<Integer> cant = new ArrayList<>();
    private List<Double> precio = new ArrayList<>();

    public void setCant(int cant) {
        this.cant.add(cant);
    }

    public void setPrecio(double precio) {
        this.precio.add(precio);
    }
       
    public double getTotal() {
        double total = 0;
        for (int i=0; i<precio.size(); i++) {
            total = total + (precio.get(i) * cant.get(i));
        }
        return total;
    }
    
    public void getMas1000() {
        for (int i=0; i<cant.size(); i++) {
            if ((precio.get(i) * cant.get(i))> 1000) {
                System.out.println("El productos"+(i+1)+
                " Precio= " + this.precio.get(i)+
                " Cantidad= " + this.cant.get(i)+
                "tiene un precio mayor a $1000");
            }
        }        
    }    
}
