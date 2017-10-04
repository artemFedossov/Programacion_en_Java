
package ar.com.educacionit.vehiculos.pruebas;

import ar.com.educacionit.vehiculos.entidades.Auto;
import ar.com.educacionit.vehiculos.entidades.Comprador;
import ar.com.educacionit.vehiculos.entidades.Vendedor;

public class Programa {
    
    public static void main(String[] args) {
        //instanciamos un auto
        Auto car = new Auto("Ford", "Focus", "rojo", 3, 2, 2);
        //instanciamos un comprador
        Comprador com = new Comprador(34000, "Facundo", "Sanchez", "87458932");
        //instanciamos un vendedor
        Vendedor ven = new Vendedor(5, "Pablo", "Perez", "67438734");
        
        //informamos
        System.out.println(car);
        System.out.println("");
        System.out.println(com);
        System.out.println("");
        System.out.println(ven);
    }//fin main
}//fin class
