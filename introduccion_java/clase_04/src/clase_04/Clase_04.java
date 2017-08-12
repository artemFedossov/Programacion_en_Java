// CLASE 04 ARRAYS
package clase_04;

public class Clase_04 {

    public static void main(String[] args) {
        
        // para inicializar el array, en caso de int se inicializa todos en 0 y los string en NULL
        int[] edades = new int[10];
        
        // si se quiere asignar un valor harcodeado
        int[] productos = {10, 30, 20, 12, 8};
        
        // agrega el dato en la posicion 9
        edades[9] = 5;
        // muestra las posiciones 9 y 4
        System.out.println(edades[9]);
        System.out.println(productos[4]);
        
        for(int i=0; i<productos.length; i++){
            // para recorrer un array, .length indica la longitud de un array
            System.out.println("posicion "+i+": "+productos[i]);
        }
        
        
        int contador = 0;
        int valor = 10;
        
        while(contador < edades.length){
            edades[contador] = valor;
            contador ++;
            valor*=2;
        }
        
            
        // copia de arreglo
        int[] copia_arreglo = new int[edades.length];
        for(int y = 0; y < edades.length; y++){
            copia_arreglo[y] = edades[y]; // accion de copiar
        }
        //redimensionar significa volver a dimensionar y perder todos los valore que ya tenia
        
        edades = new int[40];
        
        //llenar el arreglo de forma descendiente con la informacion que esta en copia_arreglo
        for(int i = copia_arreglo.length-1; i>=0; i--){
            edades[(copia_arreglo.length-1) - i]=copia_arreglo[i];
        }
        
        //recorrer
        for(int i=0; i<edades.length; i++){
            System.out.println("edades "+i+": "+edades[i]);
        }
    }
    
}
