/*
    1) Imprimir los números del 1 al 10 uno abajo del otro
    2) Imprimir los números del 1 al 10 salteando de a dos uno abajo del otro
    3) Imprimir los números del 10 al 1 uno abajo del otro
    4) Imprimir la suma de los números impares del 1 al 10
    5) Mostrar la resta de la multiplicación de los números del 1 al 5 con la suma de los números del 1 al 5. Por ejemplo, seria (1*2*3*4*5) - (1+2+3+4+5)
    6) Imprimir la siguiente figura:
       @
       @
       @
       @
    7) Imprimir la siguiente figura:
       @
       @@
       @
       @@
       @
    8) Imprimir la siguiente figura:
       @
       @@
       @@@
       @@@@
       @@@@@
    9) Imprimir la siguiente figura:
       @@@@@
       @@@@
       @@@
       @@
       @
    10) Imprimir la siguiente figura:
        @
        @@
        @@@
        @@@@
        @@@
        @@
        @
    11) Imprimir la siguiente figura:
        @@@@@
        @@@
        @
        @@@
        @@@@@

*/
package ejercicio_for_clase_03;

public class Ejercicio_for_clase_03 {

    public static void main(String[] args) {
        int suma = 0,
            multiplicacion = 1,
            resta;
        String letra = "@";
        
        System.out.println("\nEjercicio 01");
        
        for(int i=1; i<=10; i++){
            // ejercicio 01
            System.out.println("numero: "+i);
        }
        
        System.out.println("\nEjercicio 02");
        
        for(int i=1; i<=10; i++){
            // ejercicio 02
            if(i % 2 != 0){
                System.out.println("numero: "+i);
            }
        }
        
        System.out.println("\nEjercicio 03");
        
        for(int i=10; i>=1; i--){
            // ejercicio 03
            System.out.println("numero: "+i);
        }
        
        System.out.println("\nEjercicio 04");
        
        for(int i=1; i<=10; i++){
            // ejercicio 04
            if(i % 2 != 0){
                suma += i;
            }
        }
        System.out.println("Resultado: "+suma);
        
        System.out.println("\nEjercicio 05");
        
        suma = 0;
        for(int i=1; i<=5; i++){
            // ejercicio 05
            multiplicacion *= i;
            suma += i;
        }
        resta = multiplicacion - suma;
        System.out.println("Resultado: "+resta);
        
        System.out.println("\nEjercicio 06");
        
        for(int i=0; i<4; i++){
            // ejercicio 06
            System.out.println(letra);
        }        
        
        System.out.println("\nEjercicio 07");
        
        for(int i=1; i<=5; i++){
            // ejercicio 07
            if(i % 2 == 0){
                System.out.println(letra+"@");
            }
            else{
                System.out.println(letra);
            }
                
        }
        
        System.out.println("\nEjercicio 08");
        
        for(int i=1; i<=5; i++){
            // ejercicio 08
            System.out.println(letra);
            letra = letra+"@";
        }
        
        System.out.println("\nEjercicio 09");
        
        for(int i=1; i<=5; i++){
            // ejercicio 09
            for(int j=1; j<=5; j++){
                if(j>=i){
                    System.out.print("@");
                }
            }
            System.out.println("");
        }
        
        System.out.println("\nEjercicio 10");
        
        letra = "@";
        for(int i=1; i<=7; i++){
            // ejercicio 10
            if(i<=4){
                System.out.println(letra);
                letra = letra+"@";
            }else{
                for(int j=1; j<=7; j++){
                    if(j>=i){
                        System.out.print("@");
                    }
                }
                System.out.println("");
            }            
        }
        
        System.out.println("\nEjercicio 11");
        
        letra = "@";        
        for(int i=1; i<=7; i++){
            // ejercicio 11
            for(int j=1; j<=7; j++){
                if((j>=i) && (i % 2 != 0)){
                    System.out.print("@");
                }               
            }
        }
        System.out.println("");
        
    }
    
}
