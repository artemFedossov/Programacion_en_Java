package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.conectors.Connector;
import ar.com.eduit.curso.java.entities.Alumno;
import ar.com.eduit.curso.java.repositories.AlumnoR;
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
        
        
        System.out.println("-----------------------");
        ar.getAll().forEach(System.out::println);
        //ar.getLikeApellido("sal").forEach(System.out::println);
    }
}
