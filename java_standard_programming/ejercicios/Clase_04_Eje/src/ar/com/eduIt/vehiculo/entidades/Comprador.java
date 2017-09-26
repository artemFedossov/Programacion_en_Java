
package ar.com.eduIt.vehiculo.entidades;

import ar.com.eduIt.base.entidades.Persona;

public class Comprador extends Persona{
    //atributos
    private double presupuesto;
    
    //constructor
    public Comprador() {}
    public Comprador(double presupuesto, String nombre, String apellido, String numeroDocunmento) {
        super(nombre, apellido, numeroDocunmento);
        this.presupuesto = presupuesto;
    }

    //getters and setters
    public double getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "presupuesto = " + presupuesto + super.toString();
    }
    
}//fin class
