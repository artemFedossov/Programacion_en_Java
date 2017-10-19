package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.conectors.Connector;
import ar.com.eduit.curso.java.entities.Alumno;
import ar.com.eduit.curso.java.entities.Curso;
import ar.com.eduit.curso.java.repositories.AlumnoR;
import ar.com.eduit.curso.java.repositories.CursoR;
import java.sql.Connection;

public class TestRepository {
    public static void main(String[] args) {
        Connection conn=Connector.getConnection();
        AlumnoR ar=new AlumnoR(conn);
        Alumno a=new Alumno("Catalina","Miguel",26,2);
        ar.save(a);
        System.out.println(a);
        
        ar.remove(ar.getById(7));
        
        //Queda pendiente el método update()
        //y tambien el cursoR;
        
        a=ar.getById(10);
        if(a!=null){
            a.setNombre("Hernan");
            a.setApellido("Rodriguez");
            ar.update(a);
        }
        
        System.out.println("-----------------------");
        ar.getAll().forEach(System.out::println);
        //ar.getLikeApellido("sal").forEach(System.out::println);
        
        System.out.println("------------------------");
        CursoR cr=new CursoR(conn);
        Curso c=new Curso("Java","Rios","Jueves","Tarde");
        cr.save(c);
        System.out.println(c);
        
        cr.remove(cr.getById(1));
        
        c=cr.getById(2);
        if(c!=null){
            c.setTitulo("PHP");
            c.setProfesor("Estevez");
            c.setDia("Lunes");
            c.setTurno("Noche");
            cr.update(c);
        }
        
        cr.getAll().forEach(System.out::println);
        
    }
}
