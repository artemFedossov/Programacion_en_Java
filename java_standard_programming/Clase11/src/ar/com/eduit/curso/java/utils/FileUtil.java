package ar.com.eduit.curso.java.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class FileUtil implements I_File {

    private final File file;

    public FileUtil(File file) {
        this.file = file;
    }
    
    public FileUtil(String file) {
        this.file=new File(file);
    }
    
    @Override
    public void print() {
        try {
            FileReader in=new FileReader(file);
            int car;
            while((car=in.read())!=-1){
                System.out.print((char)car);
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println();
    }

    @Override
    public String getText() {
        //String texto="";
        StringBuilder texto=new StringBuilder();
        try {
            FileReader in=new FileReader(file);
            int car;
            while((car=in.read())!=-1){
                texto.append((char)car);
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return texto.toString();
    }

    @Override
    public void setText(String text) {
        try {
            FileWriter out=new FileWriter(file);
            out.write(text);
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void appendText(String text) {
        try {
            FileWriter out=new FileWriter(file,true);
            out.write(text);
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void newLine() {
        appendLine("\n");
    }

    @Override
    public void appendLine(String line) {
        try {
            BufferedWriter out=new BufferedWriter(new FileWriter(file,true));
            out.append(line);
            out.newLine();
            out.close();
        } catch (Exception e) {
        }
    }

    @Override
    public void removeLine(String line) {
        List<String> lineas=getLines();
        lineas.remove(line);
        setText("");
        lineas.forEach(item->appendLine(item));
    }

    @Override
    public List<String> getLines() {
        List<String> lineas=new ArrayList();
        try {
            BufferedReader in=new BufferedReader(new FileReader(file));
            String linea;
            while((linea=in.readLine())!=null){
                lineas.add(linea);
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lineas;
    }

    @Override
    public Set<String> getLinkedHashSetLines() {
        Set<String> setLines=new LinkedHashSet();
        setLines.addAll(getLines());
        return setLines;
    }

    @Override
    public Set<String> getTreeSetLines() {
        Set<String> setLines=new TreeSet();
        setLines.addAll(getLines());
        return setLines;
    }
    
}
