package Ejercicio_3;

//Escribe un programa que muestre por pantalla 10 palabras en inglés junto a su correspondiente traducción al castellano.
// Las palabras deben estar distribuidas en dos columnas y alineadas a la izquierda.
// Pista: Se puede insertar un tabulador mediante \t.//
public class Ejercicio15 {
    static void main(String[] args) {

        System.out.printf("%-10s %-10s\n", "cat", "gato");
        System.out.printf("%-10s %-10s\n", "computer", "odenador");
        System.out.printf("%-10s %-10s\n", "spain", "españa");
        System.out.printf("%-10s %-10s\n", "dog", "perro");
        System.out.printf("%-10s %-10s\n", "market", "tienda");
        System.out.printf("%-10s %-10s\n", "bed", "cama");
        System.out.printf("%-10s %-10s\n", "keyboard", "teclado");
        System.out.printf("%-10s %-10s\n", "pants", "pantalones");
        System.out.printf("%-10s %-10s\n", "child", "niño");
        System.out.printf("%-10s %-10s\n", "ghost", "fantasma");

        //para alinear a la derecha//

        System.out.printf("%20s %20s", "cat", "gato");

    }
}
