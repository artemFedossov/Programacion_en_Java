
package claseAbstracta;

public class Bici extends Vehiculo{
    //atributos
    private int rodado;

    //constructor
    public Bici() {}
    public Bici(int rodado, int velocidad) {
        super(velocidad);
        setRodado(rodado);
    }

    //getters and setters
    public int getRodado() {
        return rodado;
    }
    public final void setRodado(int rodado) {
        this.rodado = rodado;
    }

    @Override
    public String toString() {
        return "rodado = " + rodado + super.toString();
    }
    
    //Implemento el metodo abstracto del padre
    @Override
    public void acelerar(){
        velocidad += 5;
    }
    
}
