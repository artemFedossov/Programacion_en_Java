/*
    1) Imprimir los números del 1 al 10 uno abajo del otro
    2) Imprimir los números del 1 al 10 salteando de a 2 uno abajo del otro
    3) Imprimir los números del 10 al 1 uno abajo del otro
    4) Imprimir los números del 1 al 10 sin imprimir números 2,5 y 9 uno abajo del otro
    5) Imprimir los números del 1 al 30 sin imprimir números entre el 10 y el 20 uno abajo del otro
    6) Imprimir la suma de los números del 1 al 10
    7) Imprimir la suma de los números pares del 1 al 25
    8) Imprimir la multiplicación de los números impares que se encuentran entre -10 y 10
 */
package ejercicio_while_clase_03;

//thread.sleep(50); metodo que sirve para detener el programa si el ciclo es infinito para que el procesador no se sobre cargue

public class Ejercicio_while_clase_03 {

    public static void main(String[] args) {
        int numero,
            suma = 0,
            multiplicacion = 1,
            i = 1;
        
        System.out.println("\nEjercicio 01");
        
        while(i<=10){
            // ejercicio 1
            System.out.println("numero: "+i);
            i++;
        }
        
        System.out.println("\nEjercicio 02");
        
        while(i<=10){
            // ejercicio 2
            if(i % 2 == 1){
                System.out.println("numero: "+i);
            }
            i++;
        }
        
        System.out.println("\nEjercicio 03");
        
        i = 10;
        while(i>=1){
            // ejercicio 3
            System.out.println("numero: "+i);
            i--;
        }
        
        System.out.println("\nEjercicio 04");
        
        i = 1;
        while(i<=10){
            // ejercicio 4
            if((i != 2) && (i != 5) && (i != 9)){
                System.out.println("numero: "+i);
            }
            i++;
        }
        
        System.out.println("\nEjercicio 05");
        
        i=1;
        while(i<=30){
            // ejercicio 5
            if(i<=10 || i>= 20){
                System.out.println("numero: "+i);
            }
            i++;
        }
        
        System.out.println("\nEjercicio 06");
        
        i=1;
        while(i<=10){
            // ejercicio 6
            suma = suma + i;
            i++;
        }
        System.out.println("resultado: "+suma);
        
        System.out.println("\nEjercicio 07");
        
        i=1;
        while(i<=25){
            // ejercicio 7
            if(i % 2 == 0){
                suma = 0;
                suma += i;
            }
            i++;
        }
        System.out.println("resultado: "+suma);
        
        System.out.println("\nEjercicio 08");
        
        i=-10;
        while(i<=10){
            // ejercicio 8
            if(i % 2 != 0){
                multiplicacion = multiplicacion * i;
            }
            i++;
        }
        System.out.println("resultado: "+multiplicacion);
    }
    
}
