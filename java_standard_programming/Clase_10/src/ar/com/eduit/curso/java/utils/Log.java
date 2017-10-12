
package ar.com.eduit.curso.java.utils;

import java.net.InetAddress;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class Log {
    private static final String file = "log.csv";
    
    public static void set(Exception ex){
        LocalDateTime ldt = LocalDateTime.now();
        InetAddress inet = null;
        try {
            inet = InetAddress.getLocalHost();
        } catch (Exception e) {
            System.out.println(e);
        }
        String so = System.getProperty("os.name");
        String user = System.getProperty("user.name");
        
        String registro = ldt+";"+inet+";"+so+";"+user+";"+ex;
        
        new FileUtil(file).appendLine(registro);
    }
    
    public static void setC(Exception ex){
        set(ex);
        System.out.println("-----------------");
        System.out.println("Ocurrio un error!");
        System.out.println("-----------------");
    }
    
    public static void setJ(Exception ex){
        JOptionPane.showMessageDialog(null, "Ocurrio un erro","Error",0);        
    }
    
}
