public class Main {
    public static void main(String[] args) {

        int amountStart = 100; // начальная сумма на счете
        int amountRefillFirst = 100; // первое пополнение счета
        int amountRefillSecond = 1_000; // второе пополнение счета
        int bonus1 = 0; // расчет бонусов
        int totalFirst = (amountStart + amountRefillFirst + bonus1); // итог первого пополнения  счета
        int bonus = (amountRefillSecond / 100); // расчет бонусов
        int totalSecond = (amountStart + amountRefillSecond + bonus); // итог второго пополнения счета

        if (amountRefillFirst < 1_000) {

        }

        System.out.println("Сумма пополнения " + amountRefillFirst + " рублей");
        System.out.println("Вам начислено " + bonus + " бонусных рублей");
        System.out.println("Сумма на балансе " + totalFirst + " руб");

        if (amountRefillSecond >= 1_000) {

        }
        System.out.println("Сумма пополнения " + amountRefillSecond + " рублей");
        System.out.println("Вам начислено " + bonus + " бонусных рублей");
        System.out.println("Сумма на балансе " + totalSecond + " руб");

    }
}
