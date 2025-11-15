package practicaExamen;

import java.util.Scanner;

public class arbolNavidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt(); //variable triangulo
        int alturaTronco = scanner.nextInt(); //variable tronco
        int anchuraTronco = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = numero; j > i; j--) {
                System.out.print(" ");

            }
            for (int a = 1; a <= (2 * i - 1); a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= alturaTronco; i++) {
            for (int j = 1; j <= numero - alturaTronco / 2; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= anchuraTronco; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
