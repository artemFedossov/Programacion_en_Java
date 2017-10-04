
package ar.com.educacionit.vehiculos.entidades;

public abstract class Persona {
    //atributos
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    
    //atributos
    public Persona() {}
    public Persona(String nombre, String apellido, String numeroDocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
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
    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + "\napellido = " + apellido + "\nnumero de Documento = " + numeroDocumento;
    }
    
    
}//fin class
