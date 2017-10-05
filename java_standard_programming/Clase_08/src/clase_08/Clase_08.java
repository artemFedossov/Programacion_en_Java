
package clase_08;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Clase_08 {

    public static void main(String[] args){
        /*
            estructura try catch finally
            try{
                colocamos aca las lineas que pueden arrojar una exception.
                estas lineas son mas costosas. en cuanto al recurso de procesamiento
            }catch(Exception e){
                estas lineas se ejecutan en caso de producirse un error
                se recibe como paramentro un objeto de tipo exception
            }finally{
                estas lineas se ejecutan siempre haya error o no
            }
            estas lineas tambien se ejecutan siempre
        */
        try{
            System.out.println(10/0);
            System.out.println("esta linea no se ejecuta");
        }catch(Exception e){
            System.out.println("ocurrio un error");
            System.out.println(e);
        }finally{
            System.out.println("fin del bloque");
        }
        System.out.println("el programa termina normalmente");
        
        System.out.println("-------------------------------------");
        
        try {
            System.out.println("Se producira una Exception");
            //TestException.generarException();
            //TestException.generarException(true);
            //TestException.generarException(null);
            //TestException.generarException("hola",true);
        } catch (Exception e) {
            System.out.println("Ocurrio un error");
            System.out.println(e);
        }
        System.out.println("El programa termina normalmente");
        
        System.out.println("-------------------------------------");
        
        //captura personalizada de exception
        try {
            TestException.generarException();
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice fuera de rango");
        }catch(ArithmeticException e){
            System.out.println("Division por cero");
        }catch(NullPointerException e){
            System.out.println("Error de puntero nulo");
        }catch(NumberFormatException e){
            System.out.println("Formato de numero incorrecto");
        }
        catch(Exception e){
            System.out.println("Ocurrio un error no esperado");
        }
        
        System.out.println("-----------------------");
        
        Vuelo v1 = new Vuelo("aer1234", 100);
        Vuelo v2 = new Vuelo("lan1111", 100);
        
        try {
            v1.venderPasajes(20);
            v2.venderPasajes(10);
            v1.venderPasajes(50);
            v2.venderPasajes(30);
            v1.venderPasajes(40);   //esta venta lanza una exception
            v2.venderPasajes(10);   //esta venta no se realiza
        } catch (NoHayMasPasajesException ex) {
            System.out.println(ex);
        }

    }//fin main
}//fin class
