package ar.com.eduit.curso.java.utils;

import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FileNIO implements I_File{
    private String file;
    private Charset charset=Charset.forName("UTF-8");
    

    public FileNIO(String file) {
        this.file = file;
    }

    @Override
    public void print() {
        System.out.println(getText());
    }

    @Override
    public String getText() {
        String texto="";
        for(String linea:getLines()) texto+=linea+"\n";
        return texto;
    }

    @Override
    public void setText(String text) {
        Path archivo=Paths.get(file);
        try {
            BufferedWriter out=Files.newBufferedWriter(archivo, charset, 
                    StandardOpenOption.TRUNCATE_EXISTING);
            out.write(text);
            out.close();
        } catch (Exception e) {
            Log.setC(e);
        }
    }

    @Override
    public void appendText(String text) {
        Path archivo=Paths.get(file);
        try {
            BufferedWriter out=Files.newBufferedWriter(archivo, charset, 
                    StandardOpenOption.APPEND);
            out.write(text);
            out.close();
        } catch (Exception e) {
            Log.setC(e);
        }
    }

    @Override
    public void newLine() {
        appendText("\n");
    }

    @Override
    public void appendLine(String line) {
        appendText(line+"\n");
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
    Path archivo=Paths.get(file);
        List<String> lineas=new ArrayList();
        try {
            lineas=Files.readAllLines(archivo, charset);
        } catch (Exception e) {
            Log.setC(e);
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
