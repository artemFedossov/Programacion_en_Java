/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.vehiculos.aplicacion;

import ar.com.educacionit.vehiculos.controladores.VentanaPrincipalController;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AppConcesionaria extends Application{
    
    private Stage stagePrincipal;
    private AnchorPane rootPane;
    
    @Override
    public void start(Stage stagePrincipal) throws Exception{
        this.stagePrincipal = stagePrincipal;
        mostrarVentanaPrincipal();
        
    }
    
    public void mostrarVentanaPrincipal(){
        try {
            FXMLLoader loader = new FXMLLoader(AppConcesionaria.class.getResource("VentanaPrincipal.fxml"));
            rootPane = (AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Applicaion Concesionaria");
            stagePrincipal.setMaximized(true);
            stagePrincipal.setScene(scene);
            VentanaPrincipalController controller = loader.getController();
            controller.setProgramaPrincipal(this);
            stagePrincipal.show();
        } catch (IOException e) {
            System.out.println(e);
        }
        
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
