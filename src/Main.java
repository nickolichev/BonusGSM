public class Main {
    public static void main(String[] args) {

        int amountStart = 100; // начальная сумма на счете
        int amountRefillFirst = 100; // первое пополнение счета
        int amountRefillSecond = 1_100; // второе пополнение счета


        if (amountRefillFirst < 1000) {

            int bonus = 0; // расчет бонусов
            int totalFirst = (amountStart + amountRefillFirst + bonus); // итог первого пополнения  счета

            System.out.println("Сумма пополнения " + amountRefillFirst + " рублей");
            System.out.println("Вам начислено " + bonus + " бонусных рублей");
            System.out.println("Сумма на балансе " + totalFirst + " руб");
        }

        if (amountRefillSecond > 1000) {

            int bonus = (amountRefillSecond / 100); // расчет бонусов
            int totalSecond = (amountStart + amountRefillSecond + bonus); // итог второго пополнения счета

            System.out.println("Сумма пополнения " + amountRefillSecond + " рублей");
            System.out.println("Вам начислено " + bonus + " бонусных рублей");
            System.out.println("Сумма на балансе " + totalSecond + " руб");
        }


    }
}
