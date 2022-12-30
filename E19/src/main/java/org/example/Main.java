package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String frase;
        int opcion;
        System.out.println("Ingresa una frase: ");
        frase = scan.nextLine();
        System.out.println("Convertir:\n1. Mayúsculas\n2. Minúsculas");
        opcion = scan.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.println(frase.toUpperCase());
            }
            case 2 -> System.out.println(frase.toLowerCase());
            default -> System.out.println("Opción no válida");
        }
        scan.close();
    }
}