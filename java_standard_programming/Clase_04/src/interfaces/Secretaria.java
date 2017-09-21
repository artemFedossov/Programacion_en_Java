
package interfaces;

public class Secretaria implements Empleado{
    //atributos
    private int valorHora;
    private int cantidadHoras;
    
    //constructores
    public Secretaria() {}
    public Secretaria(int valorHora, int cantidadHoras) {
        this.valorHora = valorHora;
        this.cantidadHoras = cantidadHoras;
    }
    
    //getters and setters
    public int getValorHora() {
        return valorHora;
    }
    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
    public int getCantidadHoras() {
        return cantidadHoras;
    }
    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    @Override
    public String toString() {
        return "valorHora = " + valorHora + " cantidadHoras = " + cantidadHoras;
    }
    
    //metodo abstracto
    @Override
    public void calcularSueldo(){
        System.out.println("sueldo secretaria: " + (valorHora * cantidadHoras));
    }
    
}
