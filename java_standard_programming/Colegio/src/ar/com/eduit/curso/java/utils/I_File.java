package ar.com.eduit.curso.java.utils;

import java.util.List;
import java.util.Set;

public interface I_File {
    void print();
    String getText();
    void setText(String text);
    void appendText(String text);
    void newLine();
    void appendLine(String line);
    void removeLine(String line);
    List<String> getLines();
    Set<String> getLinkedHashSetLines();
    Set<String> getTreeSetLines();
}
