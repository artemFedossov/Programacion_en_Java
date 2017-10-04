
package ar.com.educacionit.vehiculos.entidades;

public class Comprador extends Persona{
    //atributos
    private double presupuesto;
    
    //constructor
    public Comprador() {}
    public Comprador(double presupuesto, String nombre, String apellido, String numeroDocumento) {
        super(nombre, apellido, numeroDocumento);
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
        return "Comprador:\n" + super.toString() + "\npresupuesto = " + presupuesto;
    }
    
    
}
