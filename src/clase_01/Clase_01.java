/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_01;

/**
 *
 * @author educacionit
 */
public class Clase_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final int iva=21; /*declaracion de una variable estatica, dentro de un metodo sera visible 
                            solamente en el mismo, declarada por fuera sera global para todos los 
                            metodos*/
        int numeroA;
        String nombre = "jose";
        numeroA = 20;
        char letra;
        letra = 'a';
      
        
        System.out.println(letra);
        //sout + tab genera el System.out.println
        
        
        int a = 10;
        int b = 20;
        String resultado = (a>b) ? "A es mayor":"B es mayor";
        
        System.out.println(resultado);
        //simplificacion del if !!!!!
        
    }
    
}
