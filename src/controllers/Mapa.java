package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapa {
    public Mapa() {
        HashMap();
        linkedHashMapa();
        treeMapa();
    }

    public void HashMap() {
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println("HashMap: " + mapa);
        System.out.println("Hay pera " + mapa.containsKey("Pera"));
        System.out.println("Hay kiwi " + mapa.containsKey("Kiwi"));

        System.out.println("Valor de la pera " + mapa.get("Pera"));

        mapa.remove("Pera");

        System.out.println("HashMap luego de eliminar la pera: " + mapa);
        System.out.println();
    }
    
    public void linkedHashMapa() {

        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println("LinkedHashMap: " + mapa);

        System.out.println("Hay pera " + mapa.containsKey("Pera"));
        System.out.println("Hay kiwi " + mapa.containsKey("Kiwi"));

        System.out.println("Valor de la pera: " + mapa.get("Pera"));

        mapa.remove("Pera");

        System.out.println("LinkedHashMap después de eliminar la pera: " + mapa);
        System.out.println();
    }

    public void treeMapa() {

        TreeMap<String, Integer> mapa = new TreeMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println("TreeMap: " + mapa);

        System.out.println("Hay pera " + mapa.containsKey("Pera"));
        System.out.println("Hay kiwi " + mapa.containsKey("Kiwi"));

        System.out.println("Valor de la pera: " + mapa.get("Pera"));

        mapa.remove("Pera");

        System.out.println("TreeMap después de eliminar la pera: " + mapa);
    }

}
