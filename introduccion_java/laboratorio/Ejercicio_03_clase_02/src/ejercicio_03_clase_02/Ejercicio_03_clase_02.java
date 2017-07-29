/*
    String usuario = “Pepito”, clave= “1234”;
    Informar los siguientes casos:
    Si usuario=”pepito” y clave=”1234” informar Bienvenido pepito!”
    Si usuario=”pepito” y clave no es “1234” informar “Usuario incorrecto”
    Si usuario no es “pepito” y clave= “1234” informar “Contraseña incorrecta”
 */
package ejercicio_03_clase_02;

public class Ejercicio_03_clase_02 {

    public static void main(String[] args) {
        String user = "pepito",
               password = "1234";
        
        
        // .equals sirve para comparar objetos
        if(user.equals("pepito") && password.equals("1234")){
            System.out.println("Bienvenido pepito");
        }else if(!(user.equals("pepito")) && password.equals("1234")){
            System.out.println("Usuario Incorecto");
        }else if(user.equals("pepito") && !(password.equals("1234"))){
            System.out.println("Contraseña incorrecta");
        }
            
    }
    
}
