
package practica1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practica1 {
    
    public static void main(String[] args) {
        int i;
        Scanner entrada = new Scanner(System.in);
/*
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
        nuevoEje();
        
        //----------------------------------------------------------------------
        //Creamos un nuevo Objeto para cargar notas segun el 1º ejercicio
        Ejercicio1 Eje1 = new Ejercicio1();
        //Solicitamos la cantidad de notas a cargar
        System.out.print("Ingrese la cantidad de notas: ");
        float[] n = new float[entrada.nextInt()];
        //Almacenamos las notas en un Vector
        for(i=0; i<n.length; i++){
            System.out.print("Ingrese la nota #"+ (i+1) +": ");
            n[i] = entrada.nextFloat();
        }
        Eje1.setNotas(n);
        //Procesamos las notas almacenadas para mostrar la info relevante 
        System.out.println("Tu promedio es de: " + Eje1.getPromedio());
        System.out.println("La mayor nota es de: " + Eje1.getMayor());
        nuevoEje();

        //----------------------------------------------------------------------
        //Creamos otro Objeto para cargar notas segun el 2º ejercicio
        Ejercicio2 Eje2 = new Ejercicio2();
        //Registramos todas las notas a cargar
        System.out.println("(Para finalizar ingrese el #0')");
        System.out.print("Ingrese una nota: ");
        float nota = entrada.nextFloat(); 
        while(nota != 0){
            Eje2.setNotas(nota);
            System.out.print("Ingrese otra nota: ");
            nota = entrada.nextFloat();
        }
        //Obtenemos la cantidad de aprovadas y desaprovadas
        System.out.println("La cantidad de notas aprobadas es de: " + Eje2.getAprov());
        System.out.println("La cantidad de notas desaprobadas es de: " + Eje2.getDesapro());
        nuevoEje();
       
        //----------------------------------------------------------------------
        //Creamos un Objeto para determinar el precio de "n" productos
        Ejercicio3 Eje3 = new Ejercicio3(); 
        i = 1;
        //Se solicita ingresar la info de los productos
        System.out.println("(Para salir ingrese la cantidad #0)");
        System.out.print("Ingrese la cantidad del producto n#" + i + ": ");
        int cant = entrada.nextInt();
        while (cant != 0) {
            Eje3.setCant(cant);
            System.out.print("Ingrese el precio del producto n#" + i + ": ");
            Eje3.setPrecio(entrada.nextDouble());
            i++;
            System.out.print("Ingrese la cantidad del producto n#" + i + ": ");
            cant = entrada.nextInt();
        }
        //Se imprime el total de la compra y los productos mayores a $1000
        System.out.println("El total de su compra es: " + Eje3.getTotal());
        Eje3.getMas1000();
        nuevoEje();
    */   
        //----------------------------------------------------------------------
        //Creamos 30 camiones para controlar los egresos y cuantos de estos transportan te
        Ejercicio4[] camiones = new Ejercicio4[3];
        int contaTe = 0;
        List<Integer> camionesTe = new ArrayList<>();
        //Se registra la info de cada camion egresado 
        for (i = 0; i < camiones.length; i++) {
            System.out.println("Ingrese los datos del camion #" + (i + 1));
            System.out.print("Patente: ");
            String patente = entrada.next();
            System.out.print("Nombre del chofer: ");
            String nombre = entrada.next();
            System.out.print("Tipo de carga ([1]Madera - [2]Yerba - [3]Te): ");
            int carga = entrada.nextInt();
            System.out.print("Hora de egreso: ");
            int hora = entrada.nextInt();
        //Guardamos la info cargada en un camion vacio    
            camiones[i] = new Ejercicio4(patente, nombre, carga, hora);
        //Si la carga es Te contamos el camion y guardamos su indice
            if (carga == 3) {
                contaTe++;
                camionesTe.add(i);
            }
            System.out.println();
        }
        //Imprimimos cuantos y los datos de los camiones que tranportan Te
        System.out.println("Cantidad de camiones que cargaron te: " + contaTe);
        System.out.println();
        System.out.println("=== Datos de los camiones ===");
        for (i = 0; i< camionesTe.size(); i++) {
            camiones[camionesTe.get(i)].mostrarDatos();
        }
        nuevoEje();
        
    }  

    private static void nuevoEje() {
        System.out.println("____________________________");
        System.out.println();
    }
}
