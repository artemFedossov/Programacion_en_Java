/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sobrecarga;

public class Persona {
    public String nombre;
    public int edad;
    
    //constructor
    public Persona(){
        
    };
    
    //constructor sobrecargado con 2 parametros
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override //alt insert --> tostring
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("juan", 25);
        
        System.out.println(p2);
    }
       
}
