
package validaciones;

public class Validaciones {
    //metodos
    public boolean validarSoloLetra(String cadena){
        boolean retorno = true;
        if(!cadena.matches("^[A~Za~z]*$"))  retorno = false;
        
        return retorno;
    }
}
