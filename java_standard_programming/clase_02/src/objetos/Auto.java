
package objetos;

public class Auto {
    //Atributos
    //public tiene acceso desde cualquier lado  private tiene acceso solamente la clase
    //cuando es por defecto la visibilidad es package solamente tiene acceso el paquete
    public String marca;
    public String color;
    public int velocidad;
    
    //Metodo Constructor
    public Auto(){ //constructo vacio o por defecto 
        System.out.println("creando un auto...");
    }
    
    //Metodos
    public void acelerar(){
        velocidad += 10;
    }
    public void frenar(){
        velocidad -= 5;
    }
    public void informarDatos(){
        System.out.println("marca: " + marca);
        System.out.println("color: " + color);
        System.out.println("velocidad: " + velocidad);
    }
}
