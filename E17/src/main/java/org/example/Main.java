package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dia;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un dia: ");
        dia = scan.nextLine();
        switch (dia){
            case  "lunes" :
                System.out.println("Dia laboral.");
                break;
            case  "martes" :
                System.out.println("Dia laboral.");
                break;
            case  "miercoles" :
                System.out.println("Dia laboral.");
                break;
            case  "jueves" :
                System.out.println("Dia laboral.");
                break;
            case  "viernes","Viernes" :
                System.out.println("Dia laboral.");
                break;
            case  "sabado" :
                System.out.println("Dia no laboral.");
                break;
            case  "domingo" :
                System.out.println("Dia no laboral.");
                break;
            default:
                System.out.println("Dia erroneo.");
        }
    }
}