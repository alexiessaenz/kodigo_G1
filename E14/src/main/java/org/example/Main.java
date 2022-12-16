package org.example;

import java.util.ArrayList;
import java.util.Collections;

    public class Main {
        public static void main(String[] args) {
            ArrayList<Integer> array = new ArrayList<>();
            array.add(100);
            array.add(8);
            array.add(5);
            array.add(20);
            array.add(15);
            array.add(63);
            array.add(6);
            array.add(9);
            array.add(2);
            array.add(1);
            array.add(5);
            array.add(3);
            array.add(4);
            array.add(7);
            array.add(9);
            array.add(102);
            array.add(88);
            array.add(64);

            Collections.sort(array);
            System.out.println(array);
        }
    }
