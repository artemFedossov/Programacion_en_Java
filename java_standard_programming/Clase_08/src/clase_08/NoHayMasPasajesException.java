
package clase_08;

public class NoHayMasPasajesException extends Exception{
    //atributo
    private String vuelo;
    private int cantidad;
    
    //constructor
    public NoHayMasPasajesException() {}
    public NoHayMasPasajesException(String vuelo, int cantidad) {
        this.vuelo = vuelo;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "El vuelo " + vuelo + ", no tiene " + cantidad + " pasajes.";
    }

    //getters
    public String getVuelo() {
        return vuelo;
    }
    public int getCantidad() {
        return cantidad;
    }

    
}
