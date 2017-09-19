
package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.entities.Cliente;
import ar.com.eduit.curso.java.entities.Cuenta;
import ar.com.eduit.curso.java.entities.Empleado;
import ar.com.eduit.curso.java.entities.Persona;

public class TestClase03 {
    public static void main(String[] args) {
        //testeo de la clase cuenta
        System.out.println("-- Cuenta1 --");
        Cuenta cuenta1 = new Cuenta(1, "arg$");
        cuenta1.depositar(40000);
        cuenta1.depositar(30000);
        cuenta1.debitar(15000);
        
        System.out.println(cuenta1.toString());
        System.out.println(cuenta1);
        
        /*
        //testeo de la clase persona
        System.out.println("-- persona1 --");
        Persona persona1 = new Persona("Carolina","Segovia",23);
        System.out.println(persona1);
        persona1.saludar();
        */
        
        //testeo de clase empleado
        System.out.println("-- empleado1 --");
        Empleado empleado1 = new Empleado(1, 20000, "Rafael", "Vicuña", 33);
        System.out.println(empleado1);
        empleado1.saludar();
        
        //Testeo de clase cliente
        System.out.println("-- cliente1 --");
        Cliente cliente1 = new Cliente(1,2,"Jose C.","Paz",55);
        cliente1.saludar();
        cliente1.getCuenta().depositar(20000);
        cliente1.getCuenta().depositar(10000);
        cliente1.getCuenta().debitar(3000);
        
        System.out.println(cliente1);
        System.out.println(cliente1.getCuenta());
        
        //polimorfismo
        Persona p1=new Empleado(10,10000,"Rodolfo","Solanet",34);
        Persona p2=new Cliente(10,3,"Ricardo","Fontana",44);
        
        p1.saludar();
        p2.saludar();
        
        System.out.println(empleado1.getClass());
        System.out.println(empleado1.getClass().getSimpleName());
        System.out.println(empleado1.getClass().getSuperclass());
        System.out.println(empleado1.getClass().getSuperclass().getSuperclass());
        System.out.println(empleado1.getClass().getSuperclass().getSuperclass().getSuperclass());
        
        String texto= "hola";
        
        Object obj1 = p1;
        Object obj2 = texto;
        
        //casteo
        Empleado e1 = (Empleado)p1;
        Cliente c1 = (Cliente)p2;
        
        Empleado e2 = null;
        if(p1 instanceof Empleado) e2=(Empleado)p1;
        System.out.println(e1);
    }//fin main
    
}//fin de class
