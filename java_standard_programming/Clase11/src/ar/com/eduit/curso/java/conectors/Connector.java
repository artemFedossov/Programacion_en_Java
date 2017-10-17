package ar.com.eduit.curso.java.conectors;

import ar.com.eduit.curso.java.utils.Log;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connector{
    private static Connection conn=null;
    private static String driver="com.mysql.jdbc.Driver";
    
    public static Connection getConnection(){
        if(conn==null){
            try {
                Class.forName(driver);
                return DriverManager.getConnection("jdbc:mysql://localhost/colegio", "root", "");
            } catch (Exception e) {
                Log.setC(e);
                return null;
            }
        }else{
            return conn;
        }
        /*
            Mapa de drivers
            nombre      Driver
            mysql       com.mysql.jdbc.Driver
            oracle      oracle.jdbc.Driver
            postgre     com.postgre.jdbc.Driver
        */
    }
}
