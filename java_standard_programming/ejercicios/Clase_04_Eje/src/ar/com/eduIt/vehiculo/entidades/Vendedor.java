
package ar.com.eduIt.vehiculo.entidades;

import ar.com.eduIt.base.entidades.Persona;

public class Vendedor extends Persona{
    //atributos
    private int cantAutosVendidos;
    
    //atributos
    public Vendedor() {}
    public Vendedor(int cantAutosVendidos, String nombre, String apellido, String numeroDocunmento) {
        super(nombre, apellido, numeroDocunmento);
        this.cantAutosVendidos = cantAutosVendidos;
    }
    
    //getters and setters
    public int getCantAutosVendidos() {
        return cantAutosVendidos;
    }
    public void setCantAutosVendidos(int cantAutosVendidos) {
        this.cantAutosVendidos = cantAutosVendidos;
    }

    @Override
    public String toString() {
        return "cantidad de Autos Vendidos = " + cantAutosVendidos + super.toString();
    }
    
}//fin class
