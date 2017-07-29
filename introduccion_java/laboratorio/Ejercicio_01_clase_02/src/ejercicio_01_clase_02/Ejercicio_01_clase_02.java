/*
    int nro1 = 100, nro2 = 500, nro3 = 250;
    Informar cual de los tres números es mayor
 */
package ejercicio_01_clase_02;

public class Ejercicio_01_clase_02 {

    public static void main(String[] args) {
       int num1 = 100,
           num2 = 500,
           num3 = 250;
       
       if(num1>num2 && num1>num3){
           System.out.println("El maximo es numero1: "+num1);
       }
       else if(num2>num1 && num2>num3){
           System.out.println("El maximo es numero2: "+num2);
       }
       else{
           System.out.println("El maximo es numero3: "+num3);
       }
           
    }
}
