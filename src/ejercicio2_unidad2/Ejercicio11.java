package ejercicio2_unidad2;

import java.util.Scanner;

//Programa un juego que genere un número aleatorio y te permita introducir números hasta que des con el adecuado.
// El juego deberá indicarte si el número introducido es mayor o menor.
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int min = 0;
        int max = 100;
        int random = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Ingrese el valor del numero que considera que es correcto");
        for (int i = min; i <= max; i++) {

            numero = scanner.nextInt();
            if (numero == random) {
                System.out.println("es correcto");
                break;
            } else if (numero < random) {
                System.out.println("ingrese un numero mas grande");

            } else if (numero > random) {
                System.out.println("ingrese un numero mas pequeño");
            } else {
                System.out.println("fuera de rango");

            }

        }
        scanner.close();
    }
}
