package Ejercicio_3;

import java.util.Scanner;

//Programa que lea un número entero y muestre si el número es múltiplo de 10.//
public class Ejercicio2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor");
        int A = scanner.nextInt();

        System.out.println((A % 10 == 0) ? "es multiplo" : "no es multiplo");


    }
}
