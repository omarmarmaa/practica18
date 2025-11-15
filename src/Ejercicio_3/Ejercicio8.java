package Ejercicio_3;

import java.util.Scanner;

//Crea un programa que compruebe si un año es bisiesto. //
//“Año bisiesto es el divisible entre 4, salvo que sea año secular -último de cada siglo, terminado en «00»-,
// en cuyo caso también ha de ser divisible entre 400.”
//
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el año para saber si es bisiesto");
        int año = scanner.nextInt();
        System.out.println((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0) ? "si" : "no");

    }
}
