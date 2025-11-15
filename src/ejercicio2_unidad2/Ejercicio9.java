package ejercicio2_unidad2;

//Mostrar los N primeros términos de la serie de Fibonacci. N se definirá como una variable.
public class Ejercicio9 {
    public static void main(String[] args) {

        int N = 20;
        int suma1 = 0;
        int resultado = 0;
        int suma2 = 1;
        for (int i = 1; i <= N; i++) {
            System.out.println(suma1);
            resultado = suma1 + suma2;
            suma1 = suma2;
            suma2 = resultado;


        }

    }


}

