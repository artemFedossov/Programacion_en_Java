/*
    Ingresar dos números y ofrecer al usuario un menú con las siguientes opciones: “1-suma 2-resta 3-producto 4-división”. Luego, mostrar el resultado de la operación aritmética elegida.
 */
package ejercicio_04_clase_02;
import java.util.Scanner; // importamos la clase para ingresar datos desde el teclado

public class Ejercicio_04_clase_02 {

    public static void main(String[] args) {
        int numeroA,
            numeroB,
            suma,
            multiplicacion,
            division;
        String opcion = "s";
        
        Scanner teclado = new Scanner(System.in); // creamos el objeto scanner para guardar las variables ingresadas por teclado
        
        do{
            System.out.print("\n\nIngrese numeroA: ");
            numeroA = teclado.nextInt();
            System.out.print("Imgrese numeroB: ");
            numeroB = teclado.nextInt();
            
            System.out.print("\n1) Sumar\n2) Resta\n3) Multiplicacion\n4) Division\n5) Salir\nOpcion: ");
            opcion = teclado.next();

            switch(opcion){
                case "1":
                    System.out.println("\nLa suma es: "+(numeroA + numeroB));
                    break;
                case "2":
                    System.out.println("\nLa resta es: "+(numeroA - numeroB));
                    break;
                case "3":
                    System.out.println("\nLa multiplicacion es: "+(numeroA * numeroB));
                    break;
                case "4":
                    System.out.println("\nLa division es: "+((double)numeroA / numeroB));
                    break;
                case "5":
                    opcion = "n";
                    break;
            }
            
        }while(!(opcion.equals("n")));
    }
    
}
