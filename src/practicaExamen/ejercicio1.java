package practicaExamen;

import java.util.Scanner;

// Ejercicio 1: Dado un número n introducido por teclado, muestra por pantalla la siguiente figura:
// 1
// 1 2
// 1 2 3
// ...
// 1 2 3 ... n
// (Usa bucles anidados)
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor");
        int A = scanner.nextInt();

        for (int i = 1; i <= A; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");


            }
            System.out.println();
        }

        scanner.close();
    }
}
