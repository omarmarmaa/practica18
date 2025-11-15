package Ejercicio_3;

//Escribe un programa que muestre tu horario de clase.
// Puedes usar espacios o tabuladores para alinear el texto. //
public class Ejercicio17 {
    static void main(String[] args) {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "hora", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s\n\n", "15:15 a 16:15", "Lenguaje Marcas", "optativa", "programacion", "Sistemas informacion", "Bases de datos");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s\n\n", "16:10 a 17:00", "IPE", "optativa", "programacion", "Sistemas informacion", "Bases de datos");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s\n\n", "17:05 a 17:55", "IPE", "programacion", "Bases de datos", "lenguaje marcas", "bases de datos");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s\n\n", "18:05 a 18:55", "Programacion", "Programacion", "bases de datos", "lenguaje marcas", "IPE");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s\n\n", "19:00 a 19:50", "Programacion", "Programacion", "Sistemas informacion", "Entornos Desarrollo", "ingles");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s\n\n", "19:55 a 20:45", "Programacion", "Sistemas informacion", "Sistemas informacion", "Entornos Desarrollo", "ingles");

    }
}
