package ejercicio_01;

public class Ejercicio_01_clase_01 {

    public static void main(String[] args) {
        
        System.out.println("Ejercico 1:\nDados\nnumero1 = 5\nnumero2 = 10\nnumero3 = 20\nInformar:\na) numero1 + numero2\tb) numero3 - numero1\tc) numero1 * numero3\td) numero3 / numero2");
        int numero1 = 5;
        int numero2 = 10;
        int numero3 = 20;
        
        System.out.println("\na) = "+(numero1 + numero2));
        System.out.println("b) = "+(numero3 - numero1));
        System.out.println("c) = "+(numero1 * numero3));
        System.out.println("d) = "+(numero3 / numero2));

        System.out.println("\n\nEjercico 2:\nDados\nnumero1 = 10\nnumero2 = 20\nnumero3 = 30\nInformar:\na) El total de la suma\tb) promedio de los tres\tc) el resto entre numero2 y numero1");
        int numero4 = 10;
        int numero5 = 20;
        int numero6 = 30;
        int suma = numero4 + numero5 + numero6;
        
        System.out.println("\na) = "+ suma);
        System.out.println("b) = "+(suma / 3));
        System.out.println("c) = "+(numero2 % numero1));
        
        
        System.out.println("\n\nEjercico 3:\nDados\nnumero1 = true\nnumero2 = false\nnumero3 = true\nInformar:\na) numero1 ^ numero2\tb) (numero1 & !numero2) | numero3\tc) (numero1 | numero2) & !numero3");
        boolean numero7 = true;
        boolean numero8 = false;
        boolean numero9 = true;
        
        System.out.println("\na) = "+ (numero7 ^ numero8));
        System.out.println("b) = "+((numero7 & !numero8) | numero9));
        System.out.println("c) = "+((numero7 | numero8) & !numero9));
        
        
        System.out.println("\n\nEjercico 4:\nDados\nnumero1 = 5\nnumero2 = 10\nInformar:\na) Utilizando concatenación entre las variables y los literales, mostrar en pantalla la siguiente expresión\nn1 es igual a 5,n2 es igual a 10 y n1 más n2 es igual a 15.");
        int numeroA = 5;
        int numeroB = 10;
        
        System.out.println("\na) numero1 es igual a "+numeroA+" numero2 es igual a "+numeroB+" y numero1 + numero2 es igual a "+(numeroA + numeroB));
       
        
        System.out.println("\n\nEjercico 5:\nHaciendo uso de la constante IVA=21,calcular el precio con iva de los siguientes productos\nInformar:\na) remera 59,90\tb) pantalon 99,90\tc) campera 149,90");
        double remera = 69.90;
        double pantalon = 99.90;
        double campera = 149.90;
        double impuestoIva;
        final double iva = 21;
        
        impuestoIva = (iva+100)/100;
        
        System.out.println("\na) = "+ (remera * impuestoIva));
        System.out.println("b) = "+(pantalon * impuestoIva));
        System.out.println("c) = "+(campera * impuestoIva));
       
    }
    
}
