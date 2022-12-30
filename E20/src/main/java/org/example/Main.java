package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Japan", "Tokyo");
        capitalCities.put("El Salvador", "San Salvador");

//        System.out.println(capitalCities);
        for (String i : capitalCities.keySet())
            System.out.printf("|%12s|%15s|%n",i , capitalCities.get(i) );
    }
}