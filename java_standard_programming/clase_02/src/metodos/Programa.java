/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author educacionit
 */
public class Programa {
    public static void main(String[] args) {
        //creo un objeto de la clase scanner
        Scanner lector = new Scanner(System.in);

        //creo una cuenta
        CajaDeAhorro cda = new CajaDeAhorro();
        
        //defino el estado inicial
        System.out.print("Ingrese el saldo Inicial: ");
        cda.saldo = lector.nextInt();
        
        System.out.print("Ingrese la moneda: ");
        cda.moneda = lector.next();
        
        System.out.println(cda.informarMoneda());
        
        System.out.print("Ingrese el doposito: ");
        cda.depositar(lector.nextInt());
        
        System.out.print("Ingrese la extraccion: ");
        System.out.print(cda.extraer(lector.nextInt()));
        
        
        //informar el estado de la caja
        System.out.println("");
        cda.informar();
    }
    
}
