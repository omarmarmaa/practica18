package practicaExamen.chatgpexamen.Facil;

import java.util.Scanner;

//Completa la función para que devuelva el cuadrado de un número entero.
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor");
        int numero = scanner.nextInt();

        System.out.println("El cuadrado de " + numero + " es " + cuadrado(numero));
        scanner.close();
    }

    public static int cuadrado(int numero) {
        return numero * numero;
    }
}
