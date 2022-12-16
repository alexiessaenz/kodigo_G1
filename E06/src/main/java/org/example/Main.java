package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.print("Ingrese un numero: ");
        num = scan.nextInt();
        if (num % 2 == 0)
            System.out.println("El numero es divisible entre 2");
        else
            System.out.println("El numero no es divisible entre 2");

    }
}