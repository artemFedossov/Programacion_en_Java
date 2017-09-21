
package sobrecarga;

public class Programa {
    public static void main(String[] args) {
        //creo un par de autos
        Auto a = new Auto();
        Auto b = new Auto("Honda Civic", "Blanco", 25);
        
        a.setMarca("Ford");
        a.setColor("Rojo");
        a.setVelocidad(0);
        
        a.acelerar(6000);
        
        //informar el estado de ambos objetos
        a.informar();
        System.out.println("--------------------------");
        b.informar();
    }
}
