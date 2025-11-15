package practicaExamen.chatgpexamen.While;

//Pide un número n.
//
//Calcula la suma de todos los números del 1 hasta n usando un bucle while.
//
//Imprime el resultado.
public class ejercicio3 {
    public static void main(String[] args) {
        int n = 4;
        int i = 1;
        int a = 0;
        int acumulador = 0;
        while (n >= i) {
            acumulador = a + i;
            a = acumulador;
            i++;
        }
        System.out.println(acumulador);
    }
}
