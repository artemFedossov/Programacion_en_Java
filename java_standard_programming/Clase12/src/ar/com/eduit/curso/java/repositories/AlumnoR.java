package ar.com.eduit.curso.java.repositories;

import ar.com.eduit.curso.java.entities.Alumno;
import ar.com.eduit.curso.java.utils.Log;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AlumnoR {
   private Connection conn;

    public AlumnoR(Connection conn) {
        this.conn = conn;
    }
   
    public void save(Alumno a){
        if(a==null) return;
        //String query="insert into alumnos (nombre,apellido,edad,curso) "
        //        + "values ('"+a.getNombre()+"','"+a.getApellido()
        //        +"',"+a.getEdad()+","+a.getCurso()+")";
        
        //String.format();
        //String queryP="insert into alumnos (nombre,apellido,edad,curso) "
        //        + "values ('%s','%s',%d,%d)";
        //String query=String.format(queryP, a.getNombre(),a.getApellido()
        //        ,a.getEdad(),a.getCurso());
        
        //PreparedStatement
        String query="insert into alumnos (nombre,apellido,edad,curso) values (?,?,?,?)";
        try {
            PreparedStatement ps=conn.prepareStatement(query, 1);
            ps.setString(1, a.getNombre());
            ps.setString(2, a.getApellido());
            ps.setInt(3, a.getEdad());
            ps.setInt(4, a.getCurso());
            ps.execute();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()) a.setId(rs.getInt(1));
        } catch (Exception e) {
            Log.setC(e);
        }
    }
    
    public void remove(Alumno a){
        if(a==null) return;
        String query="delete from alumnos where id="+a.getId();
        try {
            conn.createStatement().execute(query);
        } catch (Exception e) {
            Log.setC(e);
        }
    }
    
    public void update(Alumno a){
        if(a==null) return;
        String query="update alumnos set nombre=?,apellido=?,edad=?,curso=? "
                + "where id=?";
        try {
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, a.getNombre());
            ps.setString(2, a.getApellido());
            ps.setInt(3, a.getEdad());
            ps.setInt(4, a.getCurso());
            ps.setInt(5, a.getId());
            ps.execute();
        } catch (Exception e) {
            Log.setC(e);
        }
    }
    
    public Alumno getById(int id){
        List<Alumno> lista=getByFiltro("id="+id);
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }
    
    public List<Alumno> getAll(){
        return getByFiltro("1=1");
    }
    
    public List<Alumno> getByApellido(String apellido){
        return getByFiltro("apellido='"+apellido+"'");
    }
    
    public List<Alumno> getLikeApellido(String apellido){
        return getByFiltro("apellido like '%"+apellido+"%'");
    }
    
    private List<Alumno> getByFiltro(String filtro){
        String query="select * from alumnos where "+filtro;
        List<Alumno>lista=new ArrayList();
        try {
            ResultSet rs=conn.createStatement().executeQuery(query);
            while(rs.next()){
                lista.add(new Alumno(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("edad"),
                        rs.getInt("curso")
                ));
            }
        } catch (Exception e) {
            Log.setC(e);
        }
        return lista;
    }
    
}
