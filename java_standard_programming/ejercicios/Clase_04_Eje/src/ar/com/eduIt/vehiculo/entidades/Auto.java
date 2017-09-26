
package ar.com.eduIt.vehiculo.entidades;

import ar.com.eduIt.base.entidades.Vehiculo;

public class Auto extends Vehiculo{
    //atributos
    String marca;
    String modelo;
    String color;
    
    //constructor
    public Auto() {}
    public Auto(String marca, String modelo, String color, int alto, int ancho, int largo) {
        super(alto, ancho, largo);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "marca = " + marca + "\nmodelo = " + modelo + "\ncolor = " + color + super.toString();
    }
    
    
}//fin class
