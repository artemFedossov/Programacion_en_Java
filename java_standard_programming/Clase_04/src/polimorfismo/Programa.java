
package polimorfismo;

public class Programa {
    public static void main(String[] args) {
        Auto a = new Auto("ford", 0);
        AutoCarrera ac = new AutoCarrera("F1", "Ferrari", 0);
        
        a.acelerar();
        ac.acelerar();
        
        System.out.println(a.toString());
        System.out.println("---------------");
        System.out.println(ac.toString());
    }
}
