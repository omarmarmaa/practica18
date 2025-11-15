package Ejercicio_3;

import java.util.Scanner;

//Crea un programa que compruebe si eres mayor de edad. //
public class Ejercicio3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor");

        int A = sc.nextInt();

        System.out.println((A >= 18) ? "es mayor de edad" : "no es mayor de edad");


    }
}
