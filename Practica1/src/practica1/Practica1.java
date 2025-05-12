
package practica1;

import java.util.ArrayList;
import java.util.List;
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
 
        //----------------------------------------------------------------------
        //Creamos 30 camiones para controlar los egresos y cuantos de estos transportan Te
        Ejercicio4[] camiones = new Ejercicio4[30];
        int contaTe = 0;
        List<Integer> camionesTe = new ArrayList<>();
        //Se registra la info de cada camion egresado 
        for (i = 0; i < camiones.length; i++) {
            System.out.println("Ingrese los datos del camion #" + (i + 1));
            System.out.print("Patente: ");
            String patente = entrada.next();
            System.out.print("Nombre del chofer: ");
            String nombre = entrada.next();
            int carga;
            do{
                System.out.print("Tipo de carga ([1]Madera - [2]Yerba - [3]Te): ");
                carga = entrada.nextInt(); 
            } while (carga < 1 || carga > 3);

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
       
        //----------------------------------------------------------------------
        //Creamos 5 clientes de internet para calcular los montos a pagar de estos 
        Ejercicio5[] clientes = new Ejercicio5[5];
        for (i=0; i<clientes.length; i++) {
            // Ingreso de datos
            System.out.print("Ingrese el DNI del cliente #" +(i+1)+ ": ");
            int dni = entrada.nextInt();
            int tipoServicio;
            do {
                System.out.print("Ingrese el tipo de servicio ([1]30 Megas - [2]50 Megas - [3]100 Megas): ");
                tipoServicio = entrada.nextInt();
            } while (tipoServicio < 1 || tipoServicio > 3);
            clientes[i] = new Ejercicio5(dni, tipoServicio);   
        }
        for (i=0; i<clientes.length; i++) {
            clientes[i].mostrarDatos();
        }
        nuevoEje();

        //----------------------------------------------------------------------
        //Creamos 12 corredores para cargar sus tiempos y encontrar al mas rapido
        Ejercicio6[] pilotos = new Ejercicio6[12];
        for (i=0; i<pilotos.length; i++) {
            System.out.print("Ingrese el n# del #" + (i+1) +" piloto: ");
            int numpilot = entrada.nextInt();
            System.out.print("Ingrese el tiempo del piloto: ");
            int tiempo = entrada.nextInt();
            pilotos[i] = new Ejercicio6(numpilot, tiempo);
        }
        int piloto = 0;
        int menor = pilotos[0].getTiempo();
        for (i=1; i<pilotos.length; i++) {
            if (pilotos[i].getTiempo()< menor) {
                menor = pilotos[i].getTiempo();
                piloto = pilotos[i].getNumCorredor();
            }
        }
        System.out.println("Tiempo mas rapido: " + menor + " - " +
                           "Vehiculo n#: " + piloto);
        nuevoEje();
     
        //----------------------------------------------------------------------
        //Creamos una lista con personas censadas par aobtener informacion de ellas
        List<Ejercicio7> personas = new ArrayList<>();
        System.out.println("(para terminar ingrece DNI 0)");
        System.out.print("Ingrese un numero de documento: ");
        int dni = entrada.nextInt();
        while (dni != 0) {
            System.out.print("Ingrese su edad: ");
            int edad = entrada.nextInt();
            System.out.print("Ingrese el sexo (F o M): ");
            char sexo = entrada.next().toUpperCase().charAt(0);
            Ejercicio7 persona = new Ejercicio7(dni, edad, sexo);
            personas.add(persona);
            System.out.print("Ingrese otro numero de documento: ");
            dni = entrada.nextInt();
        }
        int totalPersonas = 0;
        int varones = 0;
        int mujeres = 0;
        int varonesEntre16y65 = 0;
        int mayorEdad = 0;
        int dniMayor = 0;
        char sexoMayor = 0;
        for (i=0; i<personas.size(); i++) {
            totalPersonas++;
            if (personas.get(i).getSexo() == 'M') {
                varones++;
                if (personas.get(i).getEdad() >= 16 && personas.get(i).getEdad() <= 65) {
                    varonesEntre16y65++;
                }
            } else if (personas.get(i).getSexo() == 'F') {
                mujeres++;
            }
            if (personas.get(i).getEdad() > mayorEdad){
                dniMayor = personas.get(i).getDni();
                sexoMayor = personas.get(i).getSexo();
                mayorEdad = personas.get(i).getEdad();
            }          
        }
        double porcentaje = 0;
        porcentaje = (varonesEntre16y65 * 100.00) / varones;
        System.out.println("=== Resultados del Censo ===");
        System.out.println("Total de personas censadas: " + totalPersonas);
        System.out.println("Cantidad de varones: " + varones);
        System.out.println("Cantidad de mujeres: " + mujeres);
        System.out.println("Porcentaje de varones entre 16 y 65 años: "+ porcentaje+"%");
        System.out.println("Persona con mayor edad:");
            System.out.print("  DNI: " + dniMayor);
            System.out.print(" - Edad: " + mayorEdad);
            System.out.println(" - Sexo: " + sexoMayor);
    }  

    private static void nuevoEje() {
        System.out.println("____________________________");
        System.out.println();
    }
}
