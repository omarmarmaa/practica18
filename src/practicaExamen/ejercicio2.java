package practicaExamen;

// Ejercicio 2: Muestra todos los números primos comprendidos entre 1 y 200.
// (No se permite usar métodos predefinidos, usa bucles y condicionales)
public class ejercicio2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 200; i++) {
            boolean primo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
    }
}
