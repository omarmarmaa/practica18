package Ejercicio_3;

import java.util.Scanner;

//Programa que lea dos caracteres por teclado y compruebe si son iguales. //
public class Ejercicio5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor");

        char A = scanner.next().charAt(0);

        System.out.println("Ingrese el valor");

        char B = scanner.next().charAt(0);
        System.out.println((A == B) ? "es igual" : "no es igual");

    }
}
