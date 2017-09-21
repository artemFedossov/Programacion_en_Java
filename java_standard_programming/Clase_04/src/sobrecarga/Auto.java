//una clase final no puede heredar
//un metodo final no puede ser sobreescita por clase hija
package sobrecarga;

public class Auto {
    //Atributos
    private String marca;
    private String color;
    private int velocidad;
    
    //Constructor vacio
    public Auto(){
        System.out.println("creando un auto...");
    }
    //Constructor sobrecargado, al crearlo tiene que haber si o si un constructor vacio
    public Auto(String marca, String color, int velocidad){
        //forma correcta de validar 
        setMarca(marca);
        setColor(color);
        setVelocidad(velocidad);
    }
    
    //Getters y Setters
    public String getMarca() {
        return marca;
    }
    public String getColor() {
        return color;
    }
    public int getVelocidad() {
        return velocidad;
    }
    
    public final void setMarca(String marca) {
        this.marca = marca;
    }
    public final void setColor(String color) {
        this.color = color;
    }
    public final void setVelocidad(int velocidad) {
        if(velocidad  >= 0 && velocidad <= 200){
            this.velocidad = velocidad;
        }else{
            System.out.println("Velocidad incorrecta");
        }
    }
    
    
    //Metodos
    public void acelerar(){
        this.setVelocidad(velocidad + 10);
    }
    public void frenar(){
        this.setVelocidad(velocidad - 10);
    }
    public void informar(){
        System.out.println("Marca = " + marca + "\ncolor = " + color + "\nvelocidad = " + velocidad);
    }
    
    //metodo sobre cargado con un paramnetro
    public void acelerar(int km){
        this.setVelocidad(velocidad + km);
    }
    public void frenar(int km){
        this.setVelocidad(velocidad - km);
    }
    
    //metodo sobtre cargado con 2 parametros
    public void acelerar(int km, boolean turbo){
        if(turbo){
            this.setVelocidad(velocidad + km * 2);
        }
        else{
            this.setVelocidad(velocidad + km);
        }
    }
    
}//fin class
