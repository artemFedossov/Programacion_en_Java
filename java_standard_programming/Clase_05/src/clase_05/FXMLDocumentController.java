
package clase_05;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javax.swing.JOptionPane;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField txtNombre;
    @FXML
    private CheckBox chkBici;
    @FXML
    private CheckBox chkMoto;
    @FXML
    private CheckBox chkAuto;
    @FXML
    private TextArea txaTexto;
    @FXML
    private RadioButton radSoltero;
    @FXML
    private RadioButton radCasado;
    @FXML
    private RadioButton radViudo;
    @FXML
    private RadioButton radDivorciado;
    
    private ToggleGroup grupoEstado;
    @FXML
    private ComboBox<String> cmbColores;
    
    
    @FXML
    public void aceptar(ActionEvent evt){
        String nombre = txtNombre.getText();
        JOptionPane.showMessageDialog(null, "hola "+nombre);
    }
    
    @FXML
    private void agregar(ActionEvent event) {
        String texto = "";
        String nombre = txtNombre.getText();
        if(nombre!=null && !nombre.equals("")){
            texto += "nombre: "+nombre+".\n";
        }
        if(chkBici.isSelected()){
            texto += "tiene biciclieta.\n";
        }
        if(chkMoto.isSelected()){
            texto += "tiene moto.\n";
        }
        if(chkAuto.isSelected()){
            texto += "tiene auto.\n";
        }
        //if(radSoltero.isSelected()) texto += "Estado Civil: Soltero\n";
        //if(radCasado.isSelected()) texto += "Estado Civil: Casado\n";
        //if(radViudo.isSelected()) texto += "Estado Civil: Viudo\n";
        //if(radDivorciado.isSelected()) texto += "Estado Civil: Divorciado\n";
        
        texto += "Estado Civil: " + ((RadioButton)grupoEstado.getSelectedToggle()).getText()+"\n";
        String color = cmbColores.getValue();
        texto += "Color: "+color+"\n";
        switch(color){
            case "Rojo": color="red"; break;
            case "Verde": color="green"; break;
            case "Azul": color="blue"; break;
            case "Blanco": color="white"; break;
            case "Negro": color="Black"; break;
            case "Amarillo": color="yellow"; break;
            case "Gris": color="gray"; break;
            default: color = "gray";
        }
        txaTexto.setStyle("-fx-control-inner-background:"+color+";");
        limpiar();
        
        //sistema operativo
        texto+="Sistema operativo: "+System.getProperty("os.name")+"\n";
        //versiom del sistema operativo
        texto+="version de sistema operativo: "+System.getProperty("os.version")+"\n";
        //arquitectura del sistema operativo
        texto+="arquitectura de sistema operativo: "+System.getProperty("os.arch")+"\n";
        //cantidad de procesadores
        texto+="cantidad de procesadores: "+Runtime.getRuntime().availableProcessors()+"\n";
        //nombre de usuario
        texto+="nombre de usario: "+System.getProperty("user.name")+"\n";
        texto+="directorio de usario: "+System.getProperty("user.home")+"\n";
        texto+="lenguaje de usario: "+System.getProperty("user.language")+"\n";
        texto+="version de java: "+System.getProperty("java.version")+"\n";
        
        txaTexto.setText(texto);
    }
    
    private void limpiar(){
        txtNombre.setText("");
        chkBici.setSelected(false);
        chkMoto.setSelected(false);
        chkAuto.setSelected(false);
        txtNombre.requestFocus();
        radSoltero.setSelected(true);
        cmbColores.setValue("Rojo");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        grupoEstado();
        cmbColores();
    }    

    private void cmbColores() {
        //cargar clores
        cmbColores.getItems().clear();
        cmbColores.getItems().add("Rojo");
        cmbColores.getItems().add("Verde");
        cmbColores.getItems().add("Azul");
        cmbColores.getItems().add("Negro");
        cmbColores.getItems().add("Amarillo");
        cmbColores.getItems().add("Gris");
        cmbColores.getItems().add("Blanco");
        cmbColores.setValue("Rojo");
    }    

    private void grupoEstado() {
        //inicializa el grupo
        grupoEstado = new ToggleGroup();
        radSoltero.setToggleGroup(grupoEstado);
        radCasado.setToggleGroup(grupoEstado);
        radViudo.setToggleGroup(grupoEstado);
        radDivorciado.setToggleGroup(grupoEstado);
        radSoltero.setSelected(true);
    }

    @FXML
    private void cerrar(ActionEvent event) {
        System.exit(0);
    }


    
}
