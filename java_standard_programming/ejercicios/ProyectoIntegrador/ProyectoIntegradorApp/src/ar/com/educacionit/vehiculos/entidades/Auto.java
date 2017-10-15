
package ar.com.educacionit.vehiculos.entidades;

public class Auto extends Vehiculo{
    //atributos
    private String marca;
    private String modelo;
    private String color;
    
    //constructor
    public Auto() {}
    public Auto(String marca, String modelo, String color, int alto, int ancho, int largo) {
        super(alto, ancho, largo);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
    //getters and setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto:\n" + "marca = " + marca + "\nmodelo = " + modelo + "\ncolor = " + color + super.toString();
    }
    
    
    
}//fin class
