
package ejercicio_01;

public class Vehiculo {
    //Atributos
    private int alto;
    private int ancho;
    private int largo;
    
    //Constructor

    public Vehiculo() {}    
    public Vehiculo(int alto, int ancho, int largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }
    
    //Get
    public int getAlto() {
        return alto;
    }
    public int getAncho() {
        return ancho;
    }
    public int getLargo() {
        return largo;
    }
    
    //Set
    public void setAlto(int alto) {
        this.alto = alto;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "\tVehiculo\nALTO: " + alto + " ANCHO: " + ancho + " LARGO: " + largo;
    }
    
}//fin class
