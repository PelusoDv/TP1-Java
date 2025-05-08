
package practica1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practica1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Creamos un nuevo "Objeto" Alumno
        Alumno uno = new Alumno();
        //Se cargan los datos del nuevo Alumno
        System.out.print("Ingrese el DNI del alumno: ");
            uno.setDNI(entrada.nextInt());
        System.out.print("Ingrese el Nombre del alumno: ");
            uno.setNombre(entrada.next());
        System.out.print("Ingrese el Apellido del alumno: ");
            uno.setApellido(entrada.next());
        System.out.print("Ingrese el Edad del alumno: ");
            uno.setEdad(entrada.nextInt());
        System.out.println("____________________________");
        //Se imprimen los datos del Alumno previamente cargados
            uno.getInfo();
        
        //Creamos un nuevo Objeto para cargar notas segun el 1º ejercicio
        Notas1 Eje1 = new Notas1();
        //Solicitamos la cantidad de notas a cargar
        System.out.println("____________________________");
        System.out.print("Ingrese la cantidad de notas: ");
        Eje1.setCant(entrada.nextInt()); 
        //Almacenamos las notas en un Vector
        int i;
        float[] n = new float[Eje1.getCant()];
        for(i=0; i<Eje1.getCant(); i++){
            System.out.print("Ingrese la nota nº"+ (i+1) +": ");
            n[i] = entrada.nextFloat();
        }
        Eje1.setNotas(n);
        //Procesamos las notas almacenadas para mostrar la info relevante 
        System.out.println("Tu promedio es de: " + Eje1.getPromedio());
        System.out.println("La mayor nota es de: " + Eje1.getMayor());
       
        //Creamos otro Objeto para cargar notas segun el 2º ejercicio
        Notas2 pepe2 = new Notas2();
       
        System.out.println("____________________________");
        pepe2.getNotas();
        
    }
        
}
