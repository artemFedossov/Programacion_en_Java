
package ar.com.eduIt.vehiculo.pruebas;

import ar.com.eduIt.vehiculo.entidades.Auto;
import ar.com.eduIt.vehiculo.entidades.Comprador;
import ar.com.eduIt.vehiculo.entidades.Vendedor;

public class Programa {
    public static void main(String[] args) {
        Auto a1 = new Auto("Ford", "108", "Rojo", 3, 2, 3);
        Comprador com = new Comprador(54000, "Ricardo", "Fernandez", "36459782");
        Vendedor ven = new Vendedor(5, "German", "Sanchez", "36487924");
        
        System.out.println("-- Auto --");
        System.out.println(a1);
        System.out.println("-- Comprador --");
        System.out.println(com);
        System.out.println("-- Vendedor --");
        System.out.println(ven);
    }//fin main
    
}//fin class
