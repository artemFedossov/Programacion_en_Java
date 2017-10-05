
package clase_08;

public class Vuelo {
    //atributos
    private String vuelo;
    private int cantidadPasajes;
    
    //constructor
    public Vuelo() {}
    public Vuelo(String vuelo, int cantidadPasajes) {
        this.vuelo = vuelo;
        this.cantidadPasajes = cantidadPasajes;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "vuelo=" + vuelo + ", cantidadPasajes=" + cantidadPasajes + '}';
    }
    
    //metodo
    public synchronized void venderPasajes(int cantidad) throws NoHayMasPasajesException{
        if(cantidad > cantidadPasajes) throw new NoHayMasPasajesException(vuelo,cantidad);
        cantidadPasajes -= cantidad;
    }
    
}
