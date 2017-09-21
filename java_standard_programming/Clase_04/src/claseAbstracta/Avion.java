
package claseAbstracta;

public class Avion extends Vehiculo{
    //Atributos
    private String vuelo;

    //Constructor
    public Avion() {}
    public Avion(String vuelo, int velocidad) {
        super(velocidad);
        setVuelo(vuelo);
    }

    //Getters and Setters
    public String getVuelo() {
        return vuelo;
    }
    public final void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public String toString() {
        return "vuelo = " + vuelo + super.toString();
    }
    
        @Override
    public void acelerar(){
        velocidad += 100;
    } 
    
    
}//fin class
