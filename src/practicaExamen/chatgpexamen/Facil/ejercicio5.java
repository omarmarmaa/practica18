package practicaExamen.chatgpexamen.Facil;

//Crea una función tablaMultiplicar(int n) que imprima la tabla de multiplicar del número n,
// desde n x 1 hasta n x 10.
public class ejercicio5 {
    public static void main(String[] args) {
        int n = 2;

        tablaMultiplicar(n);
    }

    public static void tablaMultiplicar(int n) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
