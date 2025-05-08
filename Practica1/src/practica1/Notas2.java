
package practica1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notas2 {
    private List notas;
    
    public void setNotas() {
        Scanner entrada = new Scanner(System.in);
        List<Integer> notas = new ArrayList<>();
        System.out.print("Ingrese una nota: ");
        int nota = entrada.nextInt(); 
        while(nota != 0){
            notas.add(nota);
            System.out.print("Ingrese otra nota: ");
            nota = entrada.nextInt();
        }
        this.notas = notas;
    }
    
    public List getNotas(){
        return this.notas;
        /*List<String> aprov = new ArrayList<>();
        List<String> desapro = new ArrayList<>();
        notas.forEach(n -> {
            if (Integer.parseInt(n) < 6) {
                desapro.add(n);
            } else {
                aprov.add(n);
            }
        });
        System.out.println("La cantidad de notas aprobadas es de: " + aprov.size());
        System.out.println("La cantidad de notas desaprobadas es de: " + desapro.size()); */
    }
    
}
