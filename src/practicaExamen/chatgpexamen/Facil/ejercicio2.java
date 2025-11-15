package practicaExamen.chatgpexamen.Facil;

import java.util.Scanner;

//Escribe una función llamada contarHasta que reciba un número n y muestre en pantalla los números del 1 al n.
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor");
        int n = scanner.nextInt();

        contar(n);
        scanner.close();
    }

    public static void contar(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
