
package entidades;

import java.util.Date;

public class Cuidador extends Persona{
    //atributos
    private int cantidadRaciones;
    
    //constructor
    public Cuidador() {}
    public Cuidador(int cantidadRaciones, String nombre, Date fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.cantidadRaciones = cantidadRaciones;
    }

    //setters and getters
    public int getCantidadRaciones() {
        return cantidadRaciones;
    }
    public void setCantidadRaciones(int cantidadRaciones) {
        this.cantidadRaciones = cantidadRaciones;
    }
    
    //metodos
    public void alimentarAnimales(){
        
    }
}//fin class
