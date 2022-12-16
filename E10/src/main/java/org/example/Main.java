package org.example;

import java.util.Scanner;

/**
 * Realizar una aplicación que nos pida un número de ventas a introducir, después nos pedirá
 * tantasventas por teclado como número de ventas se hayan indicado. Al final mostrara la suma
 * de todas lasventas. Piensa que es lo que se repite y lo que no
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cantVent, i = 0, total=0;
        System.out.print("Ingrese un numero de compras : ");
        cantVent = scan.nextInt();

        while(i++ < cantVent){
            System.out.print("precio de venta " + i + ": $");
            total+=scan.nextInt();
        }

        System.out.println("total de ventas: $" + total);
    }
}