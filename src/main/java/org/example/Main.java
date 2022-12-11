package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;

        Scanner leer = new Scanner(System.in);
        System.out.print("digite el primer valor: ");
        num1 = leer.nextByte();

        System.out.print("digite el segundo valor: ");
        num2 = leer.nextByte();

        int suma = num1 + num2;
        System.out.print("El resultado de la suma : " + suma);
        int resta = num1 - num2;
        System.out.print("El resultado de la resta : " + resta);
        int multiplicacion = num1 * num2;
        System.out.print("El resultado de la multiplicacion : " + multiplicacion);

        if (num2 != 0){
            int division = num1 / num2;
            System.out.print("El resultado de la division : " + division);
        } else {
            System.out.print("infinito");
        }


    }
}