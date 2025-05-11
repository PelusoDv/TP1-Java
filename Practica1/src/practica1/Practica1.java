
package practica1;

import java.util.Scanner;

public class Practica1 {
    
    public static void main(String[] args) {
        int i;
        Scanner entrada = new Scanner(System.in);

        //----------------------------------------------------------------------
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
            
        //----------------------------------------------------------------------
        //Creamos un nuevo Objeto para cargar notas segun el 1º ejercicio
        Ejercicio1 Eje1 = new Ejercicio1();
        //Solicitamos la cantidad de notas a cargar
        System.out.println("____________________________");
        System.out.print("Ingrese la cantidad de notas: ");
        Eje1.setCant(entrada.nextInt()); 
        //Almacenamos las notas en un Vector
        float[] n = new float[Eje1.getCant()];
        for(i=0; i<Eje1.getCant(); i++){
            System.out.print("Ingrese la nota nº"+ (i+1) +": ");
            n[i] = entrada.nextFloat();
        }
        Eje1.setNotas(n);
        //Procesamos las notas almacenadas para mostrar la info relevante 
        System.out.println("Tu promedio es de: " + Eje1.getPromedio());
        System.out.println("La mayor nota es de: " + Eje1.getMayor());

        //----------------------------------------------------------------------
        //Creamos otro Objeto para cargar notas segun el 2º ejercicio
        Ejercicio2 Eje2 = new Ejercicio2();
        //Registramos todas las notas a cargar
        System.out.println("____________________________");
        System.out.println("(Para finalizar ingrese el n'0')");
        System.out.print("Ingrese una nota: ");
        float nota = entrada.nextFloat(); 
        while(nota != 0){
            Eje2.setN(nota);
            System.out.print("Ingrese otra nota: ");
            nota = entrada.nextFloat();
        }
        //
        Eje2.setCant(Eje2.getN().size());
        float[] notas = new float[Eje2.getCant()];
        for (i=0; i<Eje2.getCant(); i++) {
            notas[i] = Eje2.getN().get(i);
        }
        Eje2.setNotas(notas);
        System.out.println("La cantidad de notas aprobadas es de: " + Eje2.getAprov());
        System.out.println("La cantidad de notas desaprobadas es de: " + Eje2.getDesapro());
        
    }
        
}
