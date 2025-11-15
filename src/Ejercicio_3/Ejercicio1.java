package Ejercicio_3;

import java.util.Scanner;

//Programa Java que lea un número entero y calcule si es par o impar.//
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese el valor ");
        int a= scanner.nextInt();
        System.out.println(( a % 2 ==0 )? "es par" : "es impar");

    }
}
