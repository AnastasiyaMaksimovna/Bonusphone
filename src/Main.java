public class Main {
    public static void main(String[] args) {
        double account = 23.75;
        int refill = 1500;
        int bonus = refill / 100;
        if (refill >= 1000) {
           System.out.println ("Пополнение на: " + refill);
           System.out.println("Бонусные рубли: " + bonus);
           System.out.println("Ваш счет: " + (account + refill + bonus));
        } else {
            System.out.println("Пополнение на: " + refill);
            System.out.println("Бонусы не начислены");
            System.out.println("Ваш счет: " + account + refill);
        }
    }
}