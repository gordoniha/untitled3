public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int data = 357;
        int refill = 2478;
        double bonus = refill * 0.15;
        int limit = 1000;
        double total = refill + data + bonus;

        if (refill > limit) {
            System.out.println("Бонус = " + bonus);
        } else {
            System.out.println("Бонус = " + 0);
        }
        System.out.println("Всего на счету = " + total);
    }
}
