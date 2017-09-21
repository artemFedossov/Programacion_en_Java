
package interfaces;

public class Contador implements Empleado{
    //atributo
    private int sueldoBase;
    private int antiguedad;
    
    //constructor

    public Contador() {}
    public Contador(int sueldoBase, int antiguedad) {
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;
    }
    
    //getters and setters

    public int getSueldoBase() {
        return sueldoBase;
    }
    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    public int getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "sueldoBase = " + sueldoBase + " antiguedad = " + antiguedad;
    }
    
    //metodo abstracto
    @Override
    public void calcularSueldo(){
        System.out.println("sueldo contador: " + (sueldoBase + sueldoBase * 0.05 * antiguedad));
    }
}//fin class
