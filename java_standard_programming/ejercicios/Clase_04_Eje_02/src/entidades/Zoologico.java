
package entidades;

public class Zoologico {
    //atributos
    public static int cantidadAnimales = 25;
    public static int racionPorAnimal = 5;
    private boolean abierto;
    
    //metodos
    public void abrir(){
        abierto = true;
    }
    public void alimentarAnimales(int unaCantidadRaciones){
        
    }
    public void cerrar(){
        abierto = false;
    }
}//fin class
