package practicaExamen;

// Ejercicio 3: Solicita un número N por teclado y muestra los N primeros términos de la serie de Fibonacci.
// Ejemplo: Si N = 7 → 0 1 1 2 3 5 8
// (Usa variables y bucles para generar la secuencia)

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        for (int i = 1; i <= numero; i++) {
            System.out.print(b + "  ");
            int suma = a + b;
            a = b;
            b = suma;

        }

    }
}
