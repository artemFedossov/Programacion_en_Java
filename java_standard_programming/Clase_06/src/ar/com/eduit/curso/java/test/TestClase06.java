
package ar.com.eduit.curso.java.test;


public class TestClase06 {
    public static void main(String[] args) {
        //clase object
        
        class ClaseEx{
            public int dato;
            
            public ClaseEx(){}
            public ClaseEx(int dato){
                this.dato = dato;
            }

            @Override
            public int hashCode() {
                //int hash = 3;
                //hash = 89 * hash + this.dato;
                //return hash;
                
                return toString().hashCode();
            }
            @Override
                    public boolean equals(Object obj){
                        return this.hashCode() == obj.hashCode();
                    }
                    
                                @Override
                    public String toString(){
                        return dato+"";
                    }
            
            /*
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null) {
                    return false;
                }
                if (getClass() != obj.getClass()) {
                    return false;
                }
                final ClaseEx other = (ClaseEx) obj;
                if (this.dato != other.dato) {
                    return false;
                }
                return true;
            }*/
            
        }


                    
        class ClaseEx2 extends ClaseEx{}
        
        ClaseEx2 ce = new ClaseEx2();
        
        System.out.println(ce.getClass());
        System.out.println(ce.getClass().getName());
        System.out.println(ce.getClass().getSimpleName());
        
        System.out.println(ce.getClass().getSuperclass().getSimpleName());
        System.out.println(ce.getClass().getSuperclass().getSuperclass().getName());
        System.out.println(ce.getClass().getSuperclass().getSuperclass().getSuperclass());
        
        String texto = "hola";
        System.out.println(texto.getClass());
        System.out.println(texto.getClass().getSuperclass());
        
        ClaseEx ce1 = new ClaseEx(2);
        ClaseEx ce2 = ce1;
        ClaseEx ce3 = new ClaseEx(2);
        ClaseEx ce4 = new ClaseEx(3);
        
        System.out.println("ce1.hashCode():"+ce1.hashCode());
        System.out.println("ce2.hashCode():"+ce2.hashCode());
        System.out.println("ce3.hashCode():"+ce3.hashCode());
        System.out.println("ce4.hashCode():"+ce4.hashCode());
        
        System.out.println("ce1.equals(ce2):"+ce1.equals(ce2));
        System.out.println("ce1.equals(ce2):"+ce1.equals(ce3));
        System.out.println("ce1.equals(ce4):"+ce1.equals(ce4));
        
        
        //clase String
        
        String cadena1 = "Hola soy una cadena de texto";
        String cadena2 = "hola";
        char[] vector = {'h','o','l','a'};
        String cadena3 = new String(vector);
        
        System.out.println(cadena1.startsWith("hola"));
        System.out.println(cadena1.startsWith("chau"));
        System.out.println(cadena1.endsWith("texto!"));
        System.out.println(cadena1.endsWith("cahu"));
        
        //metodo toLowerCVase() toUpperCase()
        System.out.println(cadena1.toLowerCase());
        System.out.println(cadena1.toUpperCase());
        
        //substring()
        System.out.println(cadena1.substring(5));
        System.out.println(cadena1.substring(3,10));
        
        //contain()
        System.out.println(cadena1.contains("soy"));
        System.out.println(cadena1.contains("paragua"));
        
        //clase system
        //metodo exit()
        //System.exit(0);
        System.out.println("Esta linea no se ejecuta");
        
        //getProperties()
        System.out.println(System.getProperties());
 
        System.out.println("----------");
        String[] propiedades = System.getProperties().toString().split(",");
        System.out.println("----------");
        
        for(int i=0; i<propiedades.length; i++)
            System.out.println(propiedades[i]);
        
        System.out.println("-------------");
        
        //getProperty
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.language"));
        System.out.println(System.getProperty("java.version"));
        
    }//fin main
}//fin class
