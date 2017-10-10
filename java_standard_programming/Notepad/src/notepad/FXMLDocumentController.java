package notepad;

import ar.com.eduit.curso.java.utils.FileUtil;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javax.swing.JOptionPane;

public class FXMLDocumentController implements Initializable {
    
    private FileUtil fileU;
    private FileChooser fc;
    
    @FXML
    private TextArea txaTexto;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fc=new FileChooser();
    }    

    @FXML
    private void nuevo(ActionEvent event) {
        txaTexto.setText("");
    }

    @FXML
    private void abrir(ActionEvent event) {
        File file=fc.showOpenDialog(null);
        if(file!=null){
            fileU=new FileUtil(file);
            txaTexto.setText(fileU.getText());
        }
    }

    @FXML
    private void guardar(ActionEvent event) {
        File file=fc.showSaveDialog(null);
        if(file!=null){
            fileU=new FileUtil(file);
            fileU.setText(txaTexto.getText());
        }
    }

    @FXML
    private void acerca(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "Curso de Java.\nOctubre 2017.");
        
    }

    @FXML
    private void salir(ActionEvent event) {
        System.exit(0);
    }
    
}
