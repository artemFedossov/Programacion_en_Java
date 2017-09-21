
package polimorfismo;

public class AutoCarrera extends Auto{
    //Atributos
    private String categoria;
 
    //constructor
    public AutoCarrera() {}
    public AutoCarrera(String categoria, String marca, int velocidad) {
        super(marca, velocidad);
        setCategoria(categoria);
    }
    
    //getters and setters
    public String getCategoria() {
        return categoria;
    }
    public final void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //sobreescribo el metodo acelerar heredado desde el padre
    //polimorfismo
    @Override
    public void acelerar(){
        velocidad += 50;
    }
    
    @Override
    public String toString() {
        return super.toString() + " categoria = " + categoria;
    }
     
}
