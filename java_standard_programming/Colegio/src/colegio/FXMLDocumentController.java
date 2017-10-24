package colegio;

import ar.com.eduit.curso.java.conectors.Connector;
import ar.com.eduit.curso.java.entities.Alumno;
import ar.com.eduit.curso.java.entities.Curso;
import ar.com.eduit.curso.java.repositories.AlumnoR;
import ar.com.eduit.curso.java.repositories.CursoR;
import ar.com.eduit.curso.java.utils.FxTable;
import ar.com.eduit.curso.java.utils.Validator;
import java.net.URL;
import java.sql.Connection;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javax.swing.JOptionPane;

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
    private Label lblInfo;
    @FXML
    private ComboBox<Curso> cmdCursos;
    @FXML
    private TableView<Alumno> tblAlumnos;
    @FXML
    private TextField txtBuscarApe;
    @FXML
    private TextField txtTitulo;
    @FXML
    private TextField txtProfesor;
    @FXML
    private Label lblInfo2;
    @FXML
    private ComboBox<String> cmbTurno;
    @FXML
    private ComboBox<String> cmbDia;
    @FXML
    private Label lblInfoCursos;
    @FXML
    private TableView<Curso> tblCurso;
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        conn=Connector.getConnection();
        ar=new AlumnoR(conn);
        cr=new CursoR(conn);
        a=new Alumno();
        c=new Curso();
        
        cargar();
    }  
    
    public void cargar(){
        
        //carga cmdCursos
        final List<Curso> lista = cr.getAll();
        cmdCursos.getItems().addAll(cr.getAll());
        if(!lista.isEmpty())    cmdCursos.setValue(lista.get(0));
        
        //carga tblAlumnos
        new FxTable().cargar(ar.getAll(), tblAlumnos);
        
        //carga cmbDia
        cmbDia.getItems().clear();
        cmbDia.getItems().addAll("Lunes","Martes","Miercoles","Juves","Viernes");
        cmbDia.setValue("Lunes");
        
        //carga cmbTurno
        cmbTurno.getItems().clear();
        cmbTurno.getItems().addAll("Mañana","Tarde","Noche");
        cmbTurno.setValue("Mañana");
        
        //cargar tblCursos
        new FxTable().cargar(cr.getAll(), tblCurso);
    }

    @FXML
    private void agregar(ActionEvent event) {
        if(validar()){
            ar.save(new Alumno(
                    txtNombre.getText(),
                    txtApellido.getText(),
                    Integer.parseInt(txtEdad.getText()),
                    cmdCursos.getValue().getId()
            ));
            lblInfo.setText("Se dio de alta un alumno.");
            limpiar();
        }else{
            lblInfo.setText("No se pudo ingresar un alumno.");
        }
        cargar();
    }
    
    private boolean validar(){
        if(!new Validator(txtNombre).size(2,20))    return false;
        if(!new Validator(txtApellido).size(2,20))    return false;
        if(!new Validator(txtEdad).isInteger(18,120))    return false;
        return true;
    }
    
    private void limpiar(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtNombre.requestFocus();
    }

    @FXML
    private void buscarApe(KeyEvent event) {
        
        new FxTable().cargar(ar.getLikeApellido(txtBuscarApe.getText()), tblAlumnos);
    }

    @FXML
    private void borrar(ActionEvent event) {
        
        a = tblAlumnos.getSelectionModel().getSelectedItem();
        if(a==null) return;
        if(JOptionPane.showConfirmDialog(null, "Estas seguro de borrar un alumno")==0){
            ar.remove(a);
        }
        cargar();
    }

    @FXML
    private void agregarCurso(ActionEvent event) {
        if(validarCurso()){
            cr.save(new Curso(
                    txtTitulo.getText(),
                    txtProfesor.getText(),
                    cmbDia.getValue(),
                    cmbTurno.getValue()
            ));
            lblInfoCursos.setText("Se ingreso un curso");
            limpiarCurso();
        }else{
            lblInfoCursos.setText("No se pudo ingresar el curso");
        }
        cargar();
        
    }
    
    private void limpiarCurso(){
        txtTitulo.setText("");
        txtProfesor.setText("");
        cmbDia.setValue("Lunes");
        cmbTurno.setValue("Mañana");
        txtTitulo.requestFocus();
    }
    
    private boolean validarCurso(){
        if(!new Validator(txtTitulo).size(2, 20)) return false;
        if(!new Validator(txtProfesor).size(2, 20)) return false;
        return true;
    }

    @FXML
    private void borraCurso(ActionEvent event) {
        
        c = tblCurso.getSelectionModel().getSelectedItem();
        if(c==null) return;
        if(JOptionPane.showConfirmDialog(null, "Estas seguro de borrar un curso")==0){
            cr.remove(c);
            lblInfoCursos.setText("Se borro un curso");
        }
        cargar();
        
    }
            
}
