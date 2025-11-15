package ejercicio2_unidad2;

import java.util.Scanner;

//Igual que el anterior, pero el valor de N se leerá por teclado.
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el limite de la suceción");
        int N = scanner.nextInt();
        int suma1 = 0;
        int suma2 = 1;
        int resultado;
        for (int i = 1; i <= N; i++) {
            System.out.println(suma1);
            resultado = suma1 + suma2;
            suma1 = suma2;
            suma2 = resultado;
        }
        scanner.close();
    }
}
