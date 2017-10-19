package ar.com.eduit.curso.java.conectors;

import ar.com.eduit.curso.java.utils.Log;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connector{
    private static Connection conn=null;
    //Driver MySQL 5
    //private static String driver="com.mysql.jdbc.Driver";
    
    //Driver MySQL 8
    private static String driver="com.mysql.cj.jdbc.Driver";
    
    //url MySQL 5
    //private static String url="jdbc:mysql://localhost/colegio";
    
    //url MySQL8
    private static String url="jdbc:mysql://localhost/colegio?serverTimezone=UTC";
    
    public static Connection getConnection(){
        if(conn==null){
            try {
                Class.forName(driver);
                return DriverManager.getConnection(url, "root", "");
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
