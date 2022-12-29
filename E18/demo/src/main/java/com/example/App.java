package com.example;
import java.util.Scanner;

/**
 * Pide por teclado dos números y genera 10 números aleatorios entre esos números. 
 * Usa el métodoMath.random para generar un número entero aleatorio (recuerda el 
 * casting de double a int).
 *
 */
public class App 
{
    public static void main( String[] args ){
        Scanner scan =  new Scanner(System.in);
        int num1, num2, num3;

        System.out.println( "Ingrese dos numeros limites: " );
        num1 = scan.nextInt();
        num2 = scan.nextInt();     // 0.0 - 1.0 ( 10 - 1 + 1 ) + 1 
        num3 = (int) (Math.random() * (num2 - num1 + 1) + num1);
        
        System.out.println( "El numero aleatorio es: " + num3);
        scan.close();
    }
}
