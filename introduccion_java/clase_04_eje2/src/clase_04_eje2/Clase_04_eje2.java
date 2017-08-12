
package clase_04_eje2;

public class Clase_04_eje2 {

    public static void main(String[] args) {
    
        double[] inflacion = {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9};
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        
        double mayor = 0,
               menor = 0,
               promedio,
               anual = 0;
        
        String mesMayor = "",
               mesMenor = "";
        
        // informar la inflacion anual
        
        for(int i=0; i<inflacion.length; i++){
            anual += inflacion[i];
        }
        System.out.println("La inflacion anual es: "+anual);
        
        // inflacion minima y maxima
        
        for(int i=0; i<inflacion.length; i++){
            if(i==0){
                mayor = inflacion[i];
                menor = inflacion[i];
                mesMayor = meses[i];
                mesMenor = meses[i];
            }
            else{
                if(inflacion[i] > mayor){
                    mayor = inflacion[i];
                    mesMayor = meses[i];
                }
                if(inflacion[i] < menor){
                    menor = inflacion[i];
                    mesMenor = meses[i];
                }
            }
        }
        
        System.out.println("El mes de "+mesMayor+" fue el de mayor inflacion con: "+mayor);
        System.out.println("El mes de "+mesMenor+" fue el de menor inflacion con: "+menor);
        
        // promedio
        
        promedio = anual / 12;
        
        System.out.println("El promedio anual de inflacion fue "+promedio);
        
    }
    
}
