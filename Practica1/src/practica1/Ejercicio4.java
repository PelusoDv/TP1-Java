
package practica1;

public class Ejercicio4 {
    private String patente;
    private String nombreCompleto;
    private int tipoCarga;
    private int horaEgreso; 
    
    public Ejercicio4(String patente, String nombreCompleto, int tipoCarga, int horaEgreso) {
        this.patente = patente;
        this.nombreCompleto = nombreCompleto;
        this.tipoCarga = tipoCarga-1;
        this.horaEgreso = horaEgreso;
    }

    public void mostrarDatos() {
        String[] cargas = {"Madera","Yerba","Te"};
        System.out.println("Patente: " + patente);
        System.out.println("Chofer: " + nombreCompleto);
        System.out.println("Tipo de carga: " + cargas[tipoCarga]);
        System.out.println("Hora de egreso: " + horaEgreso);
        System.out.println("---------------------------");
    }
}
