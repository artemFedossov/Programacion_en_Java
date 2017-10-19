package colegio;

import ar.com.eduit.curso.java.conectors.Connector;
import ar.com.eduit.curso.java.entities.Alumno;
import ar.com.eduit.curso.java.entities.Curso;
import ar.com.eduit.curso.java.repositories.AlumnoR;
import ar.com.eduit.curso.java.repositories.CursoR;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    private Connection conn;
    private AlumnoR ar;
    private CursoR cr;
    private Alumno a;
    private Curso c;
    
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtEdad;
    @FXML
    private TextField txtCurso;
    @FXML
    private Label lblInfo;
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        conn=Connector.getConnection();
        ar=new AlumnoR(conn);
        cr=new CursoR(conn);
        a=new Alumno();
        c=new Curso();
    }    

    @FXML
    private void agregar(ActionEvent event) {
        if(validar()){
            ar.save(new Alumno(
                    txtNombre.getText(),
                    txtApellido.getText(),
                    Integer.parseInt(txtEdad.getText()),
                    Integer.parseInt(txtCurso.getText())
            ));
            lblInfo.setText("Se dio de alta un alumno.");
        }else{
            lblInfo.setText("No se pudo ingresar un alumno.");
        }
    }
    
    private boolean validar(){
        return true;
    }
    
}
