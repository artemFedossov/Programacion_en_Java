package clase09;

import ar.com.eduit.curso.java.utils.FileUtil;

public class Clase09 {

    public static void main(String[] args) {
        //Test FileUtil
        //String file="c:/texto.txt";
        String file="res/texto.txt";
        FileUtil fileU=new FileUtil(file);
        //fileU.print();
        System.out.println(fileU.getText());
        
        String texto="";
        System.out.println(texto+"\t"+texto.hashCode());
        texto+="h";
        System.out.println(texto+"\t"+texto.hashCode());
        texto+="o";
        System.out.println(texto+"\t"+texto.hashCode());
        texto+="l";
        System.out.println(texto+"\t"+texto.hashCode());
        texto+="a";
        System.out.println(texto+"\t"+texto.hashCode());
        
        // Clase StringBuffer StringBuilder
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        sb.append("h");
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        sb.append("o");
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        sb.append("l");
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        sb.append("a");
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        
        fileU.setText("Curso de Java.\n");
        fileU.appendText("Primavera.\n");
        fileU.appendText("Verano.\n");
        fileU.appendText("Otoño.\n");
        fileU.appendText("Invierno.\n");
        fileU.appendLine("Lunes.");
        fileU.appendLine("Martes.");
        fileU.appendLine("Miércoles.");
        fileU.appendLine("Jueves.");
        fileU.appendLine("Viernes.");
        //fileU.print();
        
        fileU.removeLine("Jueves.");
        fileU.appendLine("Martes.");
        fileU.appendLine("Verano.");
        fileU.appendLine("Alpha");
        fileU.appendLine("Zulu");
        fileU.getLines().forEach(System.out::println);
        
        System.out.println("------------------------");
        fileU.getLinkedHashSetLines().forEach(System.out::println);
        System.out.println("------------------------");
        fileU.getTreeSetLines().forEach(System.out::println);
        
    }
    
}
