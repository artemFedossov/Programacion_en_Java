
package ar.com.eduIt.base.entidades;

public abstract class Persona {
    //atributos
    private String nombre;
    private String apellido;
    private String numeroDocunmento;
    
    //constructor
    public Persona() {}
    public Persona(String nombre, String apellido, String numeroDocunmento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocunmento = numeroDocunmento;
    }
    
    //getters and setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNumeroDocunmento() {
        return numeroDocunmento;
    }
    public void setNumeroDocunmento(String numeroDocunmento) {
        this.numeroDocunmento = numeroDocunmento;
    }

    @Override
    public String toString() {
        return "\nnombre = " + nombre + "\napellido = " + apellido + "\nnumeroDocunmento = " + numeroDocunmento + "\n";
    }
   
}//fin class
