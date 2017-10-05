
package clase_08;

public class TestException {
    public static void generarException(){
        int[] vector = new int[5];
        vector[10]=20;
    }
    public static void generarException(boolean x){
        if(x) System.out.println(10/0);
    }
    public static void generarException(String texto){
        System.out.println(texto.length());
    }
    public static void generarException(String numero, boolean x){
        if(x) System.out.println(Integer.parseInt(numero));
    }
}
