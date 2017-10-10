
package ar.com.eduit.curso.java.utils;


import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Validator {
    //para validar controles
    private JTextField swTxt=null;
    private TextField fxtxt=null;

    //constructot para swing
    public Validator(JTextField swTxt) {
        this.swTxt = swTxt;
    }
    //constructor para fx
    public Validator(TextField fxtxt) {
        this.fxtxt = fxtxt;
    }
    
    private String getTxt(){
        if(swTxt!=null)     return swTxt.getText();
        if(fxtxt!=null)     return fxtxt.getText();
        return null;
    }
    
    private void requestFocus(){
        if(swTxt!=null)     swTxt.requestFocus();
        if(fxtxt!=null)     fxtxt.requestFocus();
    }
    
    public boolean size(int size){
        if(getTxt().length()==size) return true;
        else{
            JOptionPane.showMessageDialog(null, "El largo de ser "+size+" carracteres");
            requestFocus();
            return false;
        }
    }
        
    public boolean size(int min, int max){
        int size = getTxt().length();
        if(size<min || size>max)    return true;
        else{
            JOptionPane.showMessageDialog(null, "El largo de ser entre "+ min + " y "+ max +" carracteres");
            requestFocus();
            return false;
        }
    }
    
    public boolean isInteger(){
        try {
            Integer.parseInt(getTxt());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El numero debe ser un entero");
            requestFocus();
            return false;
        }
    }
    
    public boolean isInteger(int min, int max){
        if(!isInteger())    return false;
        int numero = Integer.parseInt(getTxt());
        if(numero>=min && numero <= max)    return true;
        else{
            JOptionPane.showMessageDialog(null, "Debe ser un numero entre "+min+" y "+max);
            requestFocus();
            return false;
        }
    }
    
}//fin class
