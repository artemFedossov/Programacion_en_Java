
package test;

import validaciones;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese nombre: ");
        if(validarSoloLetra(sc.nextLine))
        String nombre = sc.nextLine();
    }   
}
