package ar.com.eduit.curso.java.utils;

import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Validator {
    private JTextField  swTxt=null;
    private TextField   fxTxt=null;

    public Validator(JTextField swTxt) {
        this.swTxt = swTxt;
    }

    public Validator(TextField fxTxt) {
        this.fxTxt = fxTxt;
    }
    
    private String getText(){
        if(swTxt!=null) return swTxt.getText();
        if(fxTxt!=null) return fxTxt.getText();
        return null;
    }
    
    private void requestFocus(){
        if(swTxt!=null) swTxt.requestFocus();
        if(fxTxt!=null) fxTxt.requestFocus();
    }
    
    public boolean size(int size){
        if(getText().length()==size) return true;
        else{
            JOptionPane.showMessageDialog(null, "El largo debe ser "
                    +size+" caracteres.");
            requestFocus();
            return false;
        }
    }
    
    public boolean size(int min,int max){
        int size=getText().length();
        if(size<min || size>max) return true;
        else{
            JOptionPane.showMessageDialog(null, "El largo debe ser entre "
                    +min+" y "+max+" caracteres.");
            requestFocus();
            return false;
        }
    }
    
    public boolean isInteger(){
        try {
            Integer.parseInt(getText());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El ser un número entero.");
            requestFocus();
            return false;
        }
    }
    
    public boolean isInteger(int min,int max){
        if(!isInteger()) return false; 
        int numero=Integer.parseInt(getText());
        if(numero>=min && numero <=max) return true;
        else{
            JOptionPane.showMessageDialog(null, "Debe ser un número entre "
                    + min +" y "+ max);
            requestFocus();
            return false;
        }
    }
}
