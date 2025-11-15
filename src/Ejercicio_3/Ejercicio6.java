package Ejercicio_3;

import java.util.Scanner;

//Programa que lea dos números por teclado y muestre el resultado de la división del primero por el segundo.//
public class Ejercicio6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor");
        int A = scanner.nextInt();
        System.out.println("Ingrese el segundo valor");
        int B = scanner.nextInt();
        System.out.println("el resultado es " + A / B);

    }
}
