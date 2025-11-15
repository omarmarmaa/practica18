public class OperadorTernario {
    public static void main(String[] args) {

        boolean tengoEfectivo = false;
        boolean tengoTarjeta = true;

        String puedoPagar = tengoEfectivo || tengoTarjeta ? "sí" : "no";
        System.out.println("Puedo pagar: " + puedoPagar);

    }
}
