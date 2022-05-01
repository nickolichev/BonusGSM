public class Main {
    public static void main(String[] args) {

        int amountStart = 100; // начальная сумма на счете
        int amountRefill = 1000; // пополнение счета
        int bonus = amountRefill / 100; // расчет бонусов
        int totalBonus = (amountStart + amountRefill + bonus); // итог пополнения  счета, в т.ч. бонусы
        int total = (amountStart + amountRefill); // итог пополнения  счета, без бонусов

        if (amountRefill < 1_000) {

            System.out.println("Сумма пополнения " + amountRefill + " рублей");
            System.out.println("Сумма на балансе " + total + " руб");

        } else {

            System.out.println("Сумма пополнения " + amountRefill + " рублей");
            System.out.println("Вам начислено " + bonus + " бонусных рублей");
            System.out.println("Сумма на балансе " + totalBonus + " руб");

        }
    }
}
