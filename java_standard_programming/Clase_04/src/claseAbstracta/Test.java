
package claseAbstracta;

public class Test {
    public static void main(String[] args) {
        Bici b = new Bici(2, 0);
        Avion a = new Avion("AR1720", 0);
        
        b.acelerar();
        a.acelerar();
        
        System.out.println(b);
        System.out.println("---------------");
        System.out.println(a);
        
        
    }//fin main
}//fin class
