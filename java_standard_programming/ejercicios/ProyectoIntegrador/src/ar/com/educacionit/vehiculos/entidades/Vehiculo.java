
package ar.com.educacionit.vehiculos.entidades;

public abstract class Vehiculo {
    //atributos
    private int alto;
    private int ancho;
    private int largo;

    //construcores
    public Vehiculo() {}
    public Vehiculo(int alto, int ancho, int largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }
    
    //getters and setters
    public int getAlto() {
        return alto;
    }
    public void setAlto(int alto) {
        this.alto = alto;
    }
    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public int getLargo() {
        return largo;
    }
    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "\nalto = " + alto + "\nancho = " + ancho + "\nlargo = " + largo;
    }
    
    
}//fin class
