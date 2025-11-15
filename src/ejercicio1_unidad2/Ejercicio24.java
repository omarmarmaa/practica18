package ejercicio1_unidad2;

import java.util.Scanner;

//Pedir un número entre 0 y 9.999, decir si es capicúa.
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero < 10) {
            System.out.println("es capicua");
        } else if (numero < 100) {
            if (numero / 10 == numero % 10) {
                System.out.println("es capicua");
            } else {
                System.out.println("no es capicua");
            }
        } else if (numero < 1000) {
            if (numero / 100 == numero % 10) {
                System.out.println("es capicua");
            } else {
                System.out.println("no es capicua");
            }
        } else if (numero < 10000) {
            if (numero / 1000 == numero % 10 && numero / 100 % 10 == numero / 10 % 10) {
                System.out.println("es capicua");
            } else {
                System.out.println("no es capicua");
            }
        } else {
            System.out.println("fuera de rango");
        }
        scanner.close();
    }
}

