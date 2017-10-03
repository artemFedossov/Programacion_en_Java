
package clase_07;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lista {
    Map<String,String> mapa;
    
    public Lista(){
        mapa = new LinkedHashMap();
        mapa.put("Lista Simple", "java.util.ArrayList");
        mapa.put("Lista Sin Duplicado", "java.util.LinkedHashSet");
        mapa.put("Lista Sin Duplicado Ordenada", "java.util.TreeSet");
    }
    
    public Map<String,String>getMapa(){
        return mapa;
    }
}
