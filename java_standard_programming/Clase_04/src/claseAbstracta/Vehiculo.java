
package claseAbstracta;

public abstract class Vehiculo {
    //atributos
    protected int velocidad;

    //constructor
    public Vehiculo() {}
    public Vehiculo(int velocidad) {
        setVelocidad(velocidad);
    }

    //Getters and Setters
    public int getVelocidad() {
        return velocidad;
    }
    public final void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return " velocidad = " + velocidad;
    }
    
    //metodo abstracto acelerar
    public abstract void acelerar();
    
}
