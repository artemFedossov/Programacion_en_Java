
package ar.com.eduit.curso.java.entities;

public class Empleado extends Persona{
    //Atributos
    private int legajo;
    private float sBasico;

    //Constructor
    public Empleado(int legajo, float sBasico, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.legajo = legajo;
        this.sBasico = sBasico;
    }
    
    //Metodo
    @Override
    public void saludar(){
        System.out.println("Hola soy un empleado!");
    }

    @Override
    public String toString() {
        return legajo + " " + sBasico + " " + super.toString();
    }

    public int getLegajo() {
        return legajo;
    }

    public float getsBasico() {
        return sBasico;
    }
    
    
    
    
}//fin class
