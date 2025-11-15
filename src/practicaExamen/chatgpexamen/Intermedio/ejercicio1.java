package practicaExamen.chatgpexamen.Intermedio;

//Crea una función llamada factorial(int n) que devuelva el factorial de un número.
//Recuerda: n! = 1 * 2 * 3 * ... * n
public class ejercicio1 {
    public static void main(String[] args) {
        int n = 4;
        int resultado = factorial(n);

        System.out.println(resultado);
    }

    public static int factorial(int n) {
        int acumulador = 0;
        int a = 1;
        for (int i = 1; i <= n; i++) {
            acumulador = a * i;
            a = acumulador;
        }
        return acumulador;
    }
}
