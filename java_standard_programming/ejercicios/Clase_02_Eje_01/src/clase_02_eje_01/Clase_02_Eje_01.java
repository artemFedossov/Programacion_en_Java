/*
Construir un vector de enteros llamado vecNumeros e inicializarlo con los números 11, -22, 33, -44, 55, -66, 77, -88, 99.
Construir un vector de enteros llamados vecPositivos, de longitud 10, que contenga los números positivos de vecNumeros.
Construir un vector de enteros llamado vecNegativos, de longitud 10, que contenga los numeros negativos de vecNumeros.
Acumular la suma de los valores positivos en una variable totalPositivos.
Acumular la suma de los valores negativos en una variable totalNegativos.
Imprimir en pantalla:
     
el contenido de vecNumeros
el contenido de vecPositivos
el contenido de vecNegativos
los valores de totalPositivos y totalNegativos  

Imprimir la suma totalPositivos y totalNegativos, sin utilizar una variable extra para sumarizarlos.
Imprimir los valores 1000 2000 3000 pasados como argumentos del programa principal.
*/
package clase_02_eje_01;

public class Clase_02_Eje_01 {

    public static void main(String[] args) {
        int[] vecNumeros = {11,-22,33,-44,55,-66,77,-88,99};
        int[] vecPositivos = new int[10];
        int[] vecNegativos = new int[10];
        int totalPositivos = 0;
        int totalNegativos = 0;
        int i;
        
        for(i=0; i < vecNumeros.length; i++){
            //asignamos los valores positivos del vector vecNumeros al vector VecPositivos
            if(vecNumeros[i]>0){
                for(int j=0; j < vecPositivos.length; j++){
                    if(vecPositivos[j] == 0){
                        vecPositivos[j] = vecNumeros[i];
                        totalPositivos += vecPositivos[j];
                        break;
                    }
                }
            }
        }
        
        for(i=0; i < vecNumeros.length; i++){
            //asignamos los valores negativos del vector vecNumeros al vector vecNegativos
            if(vecNumeros[i]<0){
                for(int j=0; j < vecNegativos.length; j++){
                    if(vecNegativos[j] == 0){
                        vecNegativos[j] = vecNumeros[i];
                        totalNegativos += vecNegativos[j];
                        break;
                    }
                }
            }
        }
        
        for(i=0; i < vecNumeros.length; i++){
            //informo el contenido del vector vecNumeros
            System.out.println("Vector Numeros "+"["+i+"] = "+vecNumeros[i]);
        }
        
        System.out.println("");
        
        for(i=0; i < vecPositivos.length; i++){
            //inform el contenido del vector vecPositivos
            if(vecPositivos[i] != 0){
                System.out.println("Vector Positivos "+"["+i+"] = "+vecPositivos[i]);
            }
        }
        
        System.out.println("");
        
        for(i=0; i < vecNegativos.length; i++){
            //inform el contenido del vector vecNegativos
            if(vecNegativos[i] != 0){
                System.out.println("Vector Negativos "+"["+i+"] = "+vecNegativos[i]);
            }
            
        }
        System.out.println("");
        System.out.println("Total Positivos: "+totalPositivos+"\nTotal Negativos: "+totalNegativos+"\nTotal Suma: "+(totalPositivos+totalNegativos));
        System.out.println("");
        
        for(i=0;i<args.length;i++){
            System.out.println("Valores args: "+args[i]);
        }
        
    }//fin del Main
    
}//fin de Class
