
package ar.com.eduit.curso.java.entities;

public class Cliente extends Persona{
    //Atributos
    private int numero;
    private Cuenta cuenta;
    
    //Constructor
    public Cliente(int numero, int numeroCuenta,String nombre,String Apellido,int edad){
        super(nombre, Apellido, edad);
        this.numero = numero;
        this.cuenta = new Cuenta(numeroCuenta,"ars$");
    }
    @Override
    public void saludar(){
        System.out.println("Hola soy un cliente");
    }

    @Override
    public String toString() {
        return numero + " " + cuenta + " " + super.toString();
    }

    public int getNumero() {
        return numero;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
    
    
    
}//fin class
