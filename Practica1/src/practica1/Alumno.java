
package practica1;

public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public int getEdad(){
     return this.edad;   
    }
    
    public int getDNI(){
        return this.dni;   
    }
    
    public void setNombre(String nom){
        this.nombre= nom;
    }
    
    public void setApellido(String apell){
        this.apellido= apell;
    }
    
    public void setEdad(int años){
        this.edad= años;
    }
    
    public void setDNI(int docu){
        this.dni= docu;
    }
    
    public void getInfo(){
        System.out.println("El alumno ingresado es: ");
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Apellido: "+ this.apellido);
        System.out.println("Edad: "+ this.edad);
        System.out.println("DNI "+ this.dni);
    }
}
