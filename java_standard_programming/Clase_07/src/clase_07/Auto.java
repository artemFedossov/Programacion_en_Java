
package clase_07;

public class Auto {
    //atributos
    private String marca;
    private String modelo;
    private String color;

    //constructor
    public Auto() {
    }
    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " " + color;
    }
    
    
    //redefenimos los hashCode para que un objeto no tenga el mismo estado
    @Override
    public int hashCode(){
        return toString().hashCode();
    }
    
    @Override
    public boolean equals(Object obj){
        return this.hashCode()==obj.hashCode();
    }
    
}
