package ar.com.eduit.curso.java.repositories;

import ar.com.eduit.curso.java.entities.Curso;
import ar.com.eduit.curso.java.utils.Log;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CursoR {
    private Connection conn;

    public CursoR(Connection conn) {
        this.conn = conn;
    }
    
    public void save(Curso c){
        String sql="insert into cursos (titulo,profesor,dia,turno) "
                + "values (?,?,?,?)";
        try {
            PreparedStatement ps=conn.prepareStatement(sql,1);
            ps.setString(1,c.getTitulo());
            ps.setString(2, c.getProfesor());
            ps.setString(3, c.getDia());
            ps.setString(4, c.getTurno());
            ps.execute();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()) c.setId(rs.getInt(1));
        } catch (Exception e) {
            Log.setC(e);
        }
        
    }
    
    public void remove(Curso c){
        if(c==null) return;
        String query="delete from cursos where id="+c.getId();
        try {
            conn.createStatement().execute(query);
        } catch (Exception e) {
            Log.setC(e);
        }
    }
    
    public void update(Curso c){
        if(c==null) return;
        String query="update cursos set titulo=?,profesor=?,dia=?,turno=?"
                + " where id=?";
        try {
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, c.getTitulo());
            ps.setString(2, c.getProfesor());
            ps.setString(3, c.getDia());
            ps.setString(4, c.getTurno());
            ps.setInt(5, c.getId());
            ps.execute();
        } catch (Exception e) {
            Log.setC(e);
        }
    }
    
    private List<Curso> getByFiltro(String filtro){
        List<Curso> lista=new ArrayList();
        String query="select * from cursos where "+filtro;
        try {
            ResultSet rs=conn.createStatement().executeQuery(query);
            while(rs.next()){
                lista.add(new Curso(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("profesor"),
                        rs.getString("dia"),
                        rs.getString("turno")
                ));
            }
        } catch (Exception e) {
            Log.setC(e);
        }
        return lista;
    }
    
    public List<Curso> getAll(){
        return getByFiltro("1=1");
    }
    
    public Curso getById(int id){
        List<Curso>lista=getByFiltro("id="+id);
        return (lista!= null && !lista.isEmpty())?lista.get(0):null;
    }
    
    public List<Curso> getByTitulo(String titulo){
        return getByFiltro("titulo='"+titulo+"'");
    }
}
