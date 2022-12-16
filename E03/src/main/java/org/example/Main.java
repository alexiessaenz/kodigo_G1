package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre;
        System.out.print("Ingrese su nombre: ");
        Scanner scan = new Scanner(System.in);
        nombre = scan.nextLine();
        System.out.println("Bienvenido, " + nombre);
    }
}