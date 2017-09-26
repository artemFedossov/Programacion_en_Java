/*
	Interfaz Grafica
	
	AWT: Abstract Windows Type (Obsoleta)
	Swing: Se ve igual en todos los SOs
	FX: Respeta el modelo vista controlodor MVC
	Scene Builder

        Anotacion Hungara
        txt: texto txtNombre
        lbl: lanel lblTexto
        btn: button btnAceptar
*/

package clase_05;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Clase_05 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("Primer Formulario");  // se le pone titulo
        //stage.setMaximized(true);  //ventana maximizada
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
