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
        int refill = 2568;
        int bonus = 0;

        int total = refill + data + bonus;

        if (refill > 1000) {
            bonus = refill/100;

        }
        System.out.println("Бонус = " + bonus);
        System.out.println("Всего на счету = " + total);
    }
}
