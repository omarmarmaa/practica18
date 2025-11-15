package practicaExamen.chatgpexamen.Intermedio;

//Crea una función fibonacci(int n) que imprima los primeros n términos de la serie Fibonacci.
public class ejercicio3 {
    public static void main(String[] args) {
        int n = 7;

        fibonacci(n);
    }

    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        int suma;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            suma = a + b;
            a = b;
            b = suma;

        }
    }
}
