
package practica1;

public class Ejercicio5 {
    private int dni;
    private int servicio;

    public Ejercicio5(int dni, int servicio) {
        this.dni = dni;
        this.servicio = servicio;
    }

    public void mostrarDatos() {
        String[] tipoServicio = {"30 Megas","50 Megas","100 Megas"};
        double[] monto = {750, 1100,(1500*0.95)};
        System.out.println("DNI: " + dni);
        System.out.print("Monto a pagar: " + monto[servicio-1] + " - ");
        System.out.println("Tipo de Servicio: Internet " + tipoServicio[servicio-1]);
        System.out.println("---------------------------");
    }
}
