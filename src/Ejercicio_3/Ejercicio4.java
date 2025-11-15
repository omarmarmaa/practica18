package Ejercicio_3;

import java.util.Scanner;

//Desarrolla un programa que compruebe si un número introducido por teclado es múltiplo de 7.//
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor");

        int A = sc.nextInt();

        System.out.println(A % 7 == 0 ? "es multiplo" : "no es multiplo");

    }
}
