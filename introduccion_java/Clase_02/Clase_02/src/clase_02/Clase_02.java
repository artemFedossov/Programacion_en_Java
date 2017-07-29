// click derrecho en la carpeta raiz/propiedades/run y pasar los argumentos simulado los datos
// para pasar por consola los argumentos se guarda el ejecutable con clean and build
// para crear una nueva clase main click derecho de la carpeta donde se encuetra el main principal new/oter/class main


package clase_02;

public class Clase_02 {

    public static void main(String[] args) {
        String nombre = args[0],
               apellido = args[1],
               dni = args[2];
        
        System.out.println(nombre+" "+apellido+" "+dni);
    }
    
}
