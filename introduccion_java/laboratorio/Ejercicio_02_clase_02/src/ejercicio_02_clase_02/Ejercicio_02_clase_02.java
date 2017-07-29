/*
    int a = 10, b=-2, c=5; // hay 2 números positivos y 1 negativo
    Informar la multiplicación de los dos números positivos
 */
package ejercicio_02_clase_02;

public class Ejercicio_02_clase_02 {

    public static void main(String[] args) {
        int a = 10,
            b = -2,
            c = 5;
        
        if(a>0 && b>0 && c<0){
            System.out.println("El resultado es a*b = "+(a*b));
        }else if(a>0 && b<0 && c>0){
            System.out.println("El resultado es a*c = "+(a*c));
        }else if(a<0 && b>0 && c>0){
            System.out.println("El resultado es b*c = "+(b*c));
        }
    }
    
}
