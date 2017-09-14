
package objetos;

public class Programa {
    //psvm tab
    public static void main(String[] args) {
        Auto a = new Auto();
        Auto b = new Auto();
        
        //defino el estado inicial del objeto
        a.marca = "honda Civic";
        a.color = "Blanco";
        a.velocidad = 25;
        
        //acelero y freno el auto
        a.acelerar(); //comando control b te lleva al metodo
        a.acelerar();
        a.acelerar();
        a.frenar();
        
        //informoel estado del objeto
        a.informarDatos();
        System.out.println("----------------------");
        b.informarDatos();
        
    }
}
