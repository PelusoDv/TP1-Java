
package practica1;

import java.util.HashMap;

public class Ejercicio4 {
    String patente;
    String nombreCompleto;
    int tipoCarga;
    int horaEgreso; 
    
    public Ejercicio4(String patente, String nombreCompleto, int tipoCarga, Integer horaEgreso) {
        this.patente = patente;
        this.nombreCompleto = nombreCompleto;
        this.tipoCarga = tipoCarga;
        this.horaEgreso = horaEgreso;
    }

    public void mostrarDatos() {
        HashMap<Integer, String> Cargas = new HashMap<Integer, String>();
        Cargas.put(1, "Madera");
        Cargas.put(2, "Yerba");
        Cargas.put(3, "Te");
        System.out.println("Patente: " + patente);
        System.out.println("Chofer: " + nombreCompleto);
        System.out.println("Tipo de carga: " + Cargas.get(tipoCarga));
        System.out.println("Hora de egreso: " + horaEgreso);
        System.out.println("---------------------------");
    }
}
