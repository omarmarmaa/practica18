public class compraDeCoche {
    public static void main(String[] args) {
        double account= 2000;
        String name="lucas";
        double remain= account;
        double carSold= 1500;
        System.out.println(name + " tiene  " + account + "€");
        System.out.println( " el coche cuesta " +  carSold + "€");

        remain= (account-carSold);
        System.out.println(name + " le queda " + remain + "€");




    }
}
