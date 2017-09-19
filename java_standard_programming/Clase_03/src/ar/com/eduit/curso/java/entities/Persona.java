
package ar.com.eduit.curso.java.entities;

public abstract class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    
    //Constructor
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " " + edad;
    }
    
    //Metodo
    
    public void saludar(){
        System.out.println("Hola soy una persona.");
    }
    
    
    
}// fin class
