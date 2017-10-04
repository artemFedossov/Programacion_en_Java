
package ar.com.educacionit.vehiculos.entidades;

public class Vendedor extends Persona{
    //atributos
    private int canAutosVendidos;
    
    //construcores
    public Vendedor() {}
    public Vendedor(int canAutosVendidos, String nombre, String apellido, String numeroDocumento) {
        super(nombre, apellido, numeroDocumento);
        this.canAutosVendidos = canAutosVendidos;
    }
    
    //getters and setters
    public int getCanAutosVendidos() {
        return canAutosVendidos;
    }
    public void setCanAutosVendidos(int canAutosVendidos) {
        this.canAutosVendidos = canAutosVendidos;
    }

    @Override
    public String toString() {
        return "Vendedor:" + super.toString()+ "\ncantidad de Autos Vendidos = " + canAutosVendidos;
    }
    
    
}
