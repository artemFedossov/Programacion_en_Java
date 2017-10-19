package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.conectors.Connector;
import java.sql.Connection;
import java.sql.ResultSet;

public class TestConnector {
    public static void main(String[] args) throws Exception{
        Connection conn=Connector.getConnection();
        
        //ejemplo de insert
        String query="insert into alumnos (nombre,apellido,edad,curso) "
                + "values ('Laura','Salinas',25,1)";
        conn.createStatement().execute(query);
        //ejemplo de select
        query="select * from alumnos";
        ResultSet rs=conn.createStatement().executeQuery(query);
        while(rs.next()){
            System.out.println(
                    rs.getInt("id")+"\t"+
                    rs.getString("nombre")+"\t"+
                    rs.getString("apellido")+"\t"+
                    rs.getInt("edad")+"\t"+
                    rs.getInt("curso")
            );
        }
        rs.close();
        conn.close();
        
        /*
        Muchas lineas de código que no usan la bd
        */
        
    }
}
