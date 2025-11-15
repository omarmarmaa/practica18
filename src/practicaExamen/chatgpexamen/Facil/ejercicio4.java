package practicaExamen.chatgpexamen.Facil;

//Crea una función contarPares(int n) que imprima únicamente los números pares entre 1 y n.
public class ejercicio4 {
    public static void main(String[] args) {
        int n = 6;

        contarPares(n);
    }

    public static void contarPares(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
