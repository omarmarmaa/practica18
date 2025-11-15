package practicaExamen.chatgpexamen.Facil;

//Crea una función llamada sumarHasta(int n) que devuelva la suma de todos los números desde 1 hasta n.
public class ejercicio3 {
    public static void main(String[] args) {
        int n = 4;
        int resultado = sumarHasta(n);
        System.out.println(resultado);
    }

    public static int sumarHasta(int n) {
        int a = 0;
        int acumalador = 0;
        for (int i = 1; i <= n; i++) {
            acumalador = a + i;
            a = acumalador;

        }
        return acumalador;
    }
}
