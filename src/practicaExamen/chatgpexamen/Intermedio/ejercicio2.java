package practicaExamen.chatgpexamen.Intermedio;

//Crea una función sumarImpares(int n) que devuelva la suma de todos los números impares entre 1 y n.
public class ejercicio2 {
    public static void main(String[] args) {
        int n = 6;
        int resultado = sumarImpares(n);

        System.out.println(resultado);
    }

    public static int sumarImpares(int n) {
        int acumulador = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                acumulador += i;
            }
        }
        return acumulador;
    }

}
