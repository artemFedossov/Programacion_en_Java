
package polimorfismo;

public class Auto {
    //Atributos
    private String marca;
    protected int velocidad;

    //Constructor
    public Auto(){}
    public Auto(String marca, int velocidad) {
        setMarca(marca);
        setVelocidad(velocidad);
    }
    
    //Getters y Setters
    public String getMarca() {
        return marca;
    }
    public final void setMarca(String marca) {
        this.marca = marca;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public final void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    //metodos
    public void acelerar(){
        velocidad += 10;
    }
            
    @Override
    public String toString() {
        return "marca " + marca + " velocida " + velocidad;
    }   
    
    
}
