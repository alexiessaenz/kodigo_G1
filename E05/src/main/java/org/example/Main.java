package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double radio, area;
        Scanner scan = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.00");
        System.out.println("Ingrese longitud del radio: ");
        radio = scan.nextDouble();
        area = Math.PI*Math.pow(radio,2);
        System.out.println("El Area del circulo es: " +
                formato.format(area));
    }
}