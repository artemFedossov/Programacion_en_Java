/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.vehiculos.controladores;

import ar.com.educacionit.vehiculos.aplicacion.AppConcesionaria;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author artem
 */
public class VentanaPrincipalController implements Initializable {

    private AppConcesionaria programaPrincipal;
    
    public void setProgramaPrincipal(AppConcesionaria programaPrincipal){
        this.programaPrincipal = programaPrincipal;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
