
package ar.com.eduit.curso.java.config;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class ConfigController implements Initializable {

    @FXML
    private TextField txtSistema;
    @FXML
    private TextField txtVersionSistema;
    @FXML
    private TextField txtArquitectura;
    @FXML
    private TextField txtVersionJava;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        txtSistema.setText(System.getProperty("os.name"));
        txtVersionSistema.setText(System.getProperty("os.version"));
        txtArquitectura.setText(System.getProperty("os.arch"));
        txtVersionJava.setText(System.getProperty("java.version"));
    }    

    @FXML
    private void salir(ActionEvent event) {
        System.exit(0);
        
    }
    
}
