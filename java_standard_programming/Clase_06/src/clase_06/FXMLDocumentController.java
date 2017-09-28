
package clase_06;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;


public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField txtUrl;
    @FXML
    private WebView webView;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        navegar();
    }    

    @FXML
    private void ir(ActionEvent event) {
        navegar();
    }
    
    //mtodo
    
    private void navegar(){
        String url = txtUrl.getText();
        if(!url.startsWith("http://")){
            url="http://"+url;
            txtUrl.setText(url);
        }
        webView.getEngine().load(url); // pide el motor del navegador y le pasamos la url que se pidio
        
        
    }
    
}
