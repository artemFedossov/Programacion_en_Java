
package interfaces;

public class Test {
    public static void main(String[] args) {
        Secretaria s = new Secretaria(200, 160);
        Contador c = new Contador(3000, 10);
        
        s.calcularSueldo();
        c.calcularSueldo();
        
    }//fin main
    
}//fin class
