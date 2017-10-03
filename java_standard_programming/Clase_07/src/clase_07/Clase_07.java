// clase 07 Framework Collection
package clase_07;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Clase_07 {

    public static void main(String[] args) {
        //array
        Auto[] autos = new Auto[4];
        autos[0] = new Auto("Ford","Focus","Verde");
        autos[1] = new Auto("Fiat","Idea","Rojo");
        autos[2] = new Auto("VW","Suran","Blanco");
        autos[3] = new Auto("Renault","Sandero","Bordo");
        
        for (Auto auto:autos)   System.out.println(auto); //Una forma de recorrer array sin utilizar los indices
        
        //Interfas List:    Implementacion ArrayList y LinkedList
        
        List lista1 = new ArrayList();
        
        lista1.add(new Auto("Peugeot","208","Negro"));
        lista1.add(new Auto("VW","Up","Gris"));
        lista1.add("hola");
        lista1.add(23);
        
        //copiamos los autos del vector autos a lista1
        for(Auto auto:autos)    lista1.add(auto);
        
        //recorremos por indice
        System.out.println("----------recorrido por indice-------------");
        for(int i=0; i<lista1.size();i++)   System.out.println(lista1.get(i));
        
        //recorremos por objetos
        System.out.println("----------recorrido por objetos-------------");
        for (Object obj:lista1) System.out.println(obj);
        
        //recorremos java8
        System.out.println("---------recorrido java 8--------------");
        lista1.forEach(item->System.out.println(item));
        System.out.println("---------recorrido java 8 (2)--------------");
        lista1.forEach(System.out::println);
        
        //Lista Tipada <Generics>
        
        List<Auto>lista2 = new ArrayList();
        
        lista2.add(new Auto("Chevrolet","Corsa","Blanco"));
        lista2.add(new Auto("VW","Gol","Azul"));
        
        Auto auto1 = (Auto)lista1.get(0);
        Auto auto2 = lista2.get(0);
        
        //copiamos los autos de lista1 a lista2
        lista1.forEach(item->{
            if(item instanceof Auto)    lista2.add((Auto)item);
        });
        
        //recorremos lista2
        System.out.println("-------------recorremos lista2--------");
        lista2.forEach(System.out::println);
        
        //Interface set
        //la interface set es similat a list pero no permite valores duplicados
        Set<String> set;
        //implemetacion HashSet(): es la mas veloz no garantiza el orden de los elementos
        set=new HashSet();
        set.add("lunes");
        set.add("martes");
        set.add("lunes");
        set.add("miercoles");
        set.add("jueves");
        set.add("viernes");
        System.out.println("-------------HashSet--------");
        set.forEach(System.out::println);
        
        //implementacion TreeSet(): garantiza el orden de los elementos en orden natural
        set=new TreeSet();
        set.add("lunes");
        set.add("martes");
        set.add("lunes");
        set.add("miercoles");
        set.add("jueves");
        set.add("viernes");
        System.out.println("-------------TreeSet--------");
        set.forEach(System.out::println);
        
        //implementacion LinkedHashSet(): almacena los elementos por orden de ingreso
        set=new LinkedHashSet();
        set.add("lunes");
        set.add("martes");
        set.add("lunes");
        set.add("miercoles");
        set.add("jueves");
        set.add("viernes");
        System.out.println("-------------LinkedHashSet--------");
        set.forEach(System.out::println);
        
        Set<Auto> setAutos = new LinkedHashSet();
        //agregamos a setAutos los autos de lista2
        
        lista2.forEach(setAutos::add);        
        setAutos.add(new Auto("VW","Gol","Azul"));
        
        System.out.println("-------------mostramos setAutos--------");
        setAutos.forEach(System.out::println);
        
        System.out.println("-------------mostramos setAutos y su hashCode--------");
        setAutos.forEach(item->System.out.println(item+"\t"+item.hashCode()));
        
        /*
            pilas y colas
        
            pilas Stack LIFO: Last In First Out
        
            cola Queue (ArrayDeque)     FIFO: First In First Out
        */
        
        //Ejemplos de pila
        Stack<Auto> pilaAutos = new Stack();
        pilaAutos.push(new Auto("VW","Vento","Azul"));
        pilaAutos.push(new Auto("Citroen","C4","Amarillo"));
        
        //apilamos los autos de lista2
        lista2.forEach(pilaAutos::push);
        
        System.out.println("---------------recorremos pila autos----------------");
        pilaAutos.forEach(System.out::println);
        
        System.out.println("---------------longitud de pilaAutos----------------");
        System.out.println("longitu de pilaAutos = "+pilaAutos.size());
        
        while(!pilaAutos.isEmpty()){
            System.out.println(pilaAutos.pop()); //elimina del primero a ultimo agregados
        }
        
        //colas
        ArrayDeque<Auto> colaAutos = new ArrayDeque();
        colaAutos.offer(new Auto("Chevrolet", "Meriva", "Gris"));
        colaAutos.offer(new Auto("Renault", "Kangoo", "Blanco"));
        
        //encolamos los autos de lista2
        lista2.forEach(colaAutos::offer);
        System.out.println("---------------recorremos cola autos----------------");
        colaAutos.forEach(System.out::println);
        System.out.println("---------------longitud de colaAutos----------------");
        System.out.println("longitu de pilaAutos = "+colaAutos.size());
        
        while(!colaAutos.isEmpty()){
            System.out.println(colaAutos.poll()); //elimina del primero a ultimo agregados
        }
        
        //interfaz map
        //permite representar un vector asociativo del tipo key value
        Map <String,String> mapa;
        
        //implementacion HashMap
        //es la mas velor, no garantiza el orden de los elementos
        mapa = new HashMap();
        System.out.println("-----------HashMap-----------");
        mapa.put("monday","lunes");
        mapa.put("tuesday","martes");
        mapa.put("wednesday","miercoles");
        mapa.put("thurday","jueves");
        mapa.put("friday","viernes");
        System.out.println(mapa.get("monday"));
        System.out.println("----------recorremos HashMap-----------------");
        mapa.forEach((k,v)->System.out.println(k+" - " + v));
        
        //implementacion TreeMap
        //almacena los valores en un arbol, los almacena ordenados naturalmente
        mapa = new TreeMap();
        System.out.println("-----------TreeMap-----------");
        mapa.put("monday","lunes");
        mapa.put("tuesday","martes");
        mapa.put("wednesday","miercoles");
        mapa.put("thurday","jueves");
        mapa.put("friday","viernes");
        System.out.println("----------recorremos TreeMap-------------");
        mapa.forEach((k,v)->System.out.println(k+" - " + v));
        
        //implementacion LinkedHashMap
        //almacena elementos por orden de ingreso
        mapa = new LinkedHashMap();
        System.out.println("-----------LinkedHashMap-----------");
        mapa.put("monday","lunes");
        mapa.put("tuesday","martes");
        mapa.put("wednesday","miercoles");
        mapa.put("thurday","jueves");
        mapa.put("friday","viernes");
        System.out.println("----------recorremos LinkedHashMap---------------");
        mapa.forEach((k,v)->System.out.println(k+" - " + v));
        
        //Enumerado a prtir de java 5
        String estadoCivil = EstadoCivil.SOLTERO.toString();
        EstadoCivil estado = EstadoCivil.CASADO;
        
        System.out.println("----------estado civil---------------");
        System.out.println(estadoCivil);
        System.out.println(estado);
        
    }//fin main
    
}//fin class
