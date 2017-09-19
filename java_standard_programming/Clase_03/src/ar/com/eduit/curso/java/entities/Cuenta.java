
package ar.com.eduit.curso.java.entities;

public class Cuenta {
    //Atributos
    private int numero;
    private String moneda;
    private float saldo;
    
    //Constructor
    public Cuenta(int numero, String moneda) {
        this.numero = numero;
        this.moneda = moneda;
    }
    
    //metodos
    public void depositar(float monto){
        this.saldo += monto;
    }
    
    public void debitar(float monto){
        if(monto <= saldo){
           this.saldo -= monto; 
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getMoneda() {
        return moneda;
    }

    public float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return numero + " " + moneda + " " + saldo;
    }
    
    
}//fin de class
