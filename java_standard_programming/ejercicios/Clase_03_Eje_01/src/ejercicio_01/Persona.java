
package ejercicio_01;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    
    //Constructor
    public Persona(){}
    public Persona(String nombre, String apellido, String numeroDocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
    }
    
    //Getter y Setter
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
    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public String toString() {
        return "\tPersona\nNOMBRE: " + nombre + " APELLIDO: " + apellido + " Nº DNI: " + numeroDocumento;
    }
    
    
    
}//fin class
