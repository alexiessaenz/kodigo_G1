package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Realizar una aplicación que nos calcule una ecuación de segundo grado.
        Debes pedir las variables a, b y c por teclado y comprobar antes que el
        discriminante (operación en la raíz cuadrada). Para la raíz cuadrada usa
        el método sqlrt de Math. Te recomiendo que uses mensajes de traza.*/

        //declaracion de instancias y variables

        Scanner leer = new Scanner(System.in);
        int  a = 0, b=0 , c= 0;

        System.out.println("Digite el valor de a: ");
        a = leer.nextInt();
        System.out.println("Digite el valor de b: ");
        b = leer.nextInt();
        System.out.println("Digite el valor de c: ");
        c = leer.nextInt();

        double desciminante = Math.pow(b,2) -(4*a*c);

        System.out.println(">>");

        if(desciminante > 0){
            double x1 = (b*(-1)+Math.sqrt(desciminante))/(2*a);
            System.out.println("El valor de X1 es: "+x1);
        }else{
            System.out.println("El discrimante es negativo");
        }
    }
}