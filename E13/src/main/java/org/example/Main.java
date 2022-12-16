package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("A");
        array.add("G");
        array.add("H");
        array.add("B");
        array.add("J");
        array.add("I");
        array.add("Y");
        array.add("C");
        array.add("O");
        array.add("P");
        array.add("G");
        array.add("Z");
        array.add("H");
        array.add("I");
        array.add("D");
        array.add("S");

        Collections.sort(array);
        System.out.println(array);
    }
}