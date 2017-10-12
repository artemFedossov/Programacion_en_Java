package clase_10;

import ar.com.eduit.curso.java.utils.FileNIO;
import ar.com.eduit.curso.java.utils.Log;
import java.util.HashSet;
import java.util.Set;

public class Clase_10 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            Log.setC(e);
        }
        //paquete neio New Input Ouput jdk5
        String file = "res/texto2.txt";
        FileNIO fileN = new FileNIO(file);
        fileN.setText("Hola a todos\n");
        
        fileN.appendText("Primavera\n");
        fileN.appendText("Otoño\n");
        fileN.appendText("Invierno\n");
        fileN.appendText("Verano\n");
        
        fileN.appendLine("lunes");
        fileN.appendLine("martes");
        fileN.appendLine("miercoles");
        fileN.appendLine("jueves");
        fileN.appendLine("viernes");
        
        fileN.removeLine("Invierno");
        fileN.appendLine("lunes");
        fileN.appendLine("martes");
        
        System.out.println(fileN.getText());
        System.out.println("-------------");
        fileN.getLines().forEach(System.out::println);
        System.out.println("-------------");
        fileN.print();
        System.out.println("-------------");
        fileN.getLinkedHashSetLines().forEach(System.out::println);
        System.out.println("-------------");
        fileN.getTreeSetLines().forEach(System.out::println);
    }
}
