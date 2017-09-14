
package metodos;

public class CajaDeAhorro {
    //Atributos
    public int saldo;
    public String moneda;
    
    //Constructor
    public CajaDeAhorro(){}
    
    //Metodos
    public void informar(){
        System.out.println("Saldo: "+saldo+" "+moneda);
    }
    
    public void depositar(int monto){
        saldo += monto;
    }
    
    public String informarMoneda(){
        return "moneda: " + this.moneda;
    }
    
    public String extraer(int monto){
        String retorno;
        if(monto <= saldo)
        {
            saldo -= monto;
            retorno = "LA EXTRACCION ES CORECTA";
        }else{
            retorno = "FONDOS INSUFICIENTES";
        }
        
        return retorno;
    }
    
}//fin de class cajaDeAhorro
