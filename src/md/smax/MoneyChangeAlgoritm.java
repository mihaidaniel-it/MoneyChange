package md.smax;
import java.util.Scanner;

public class MoneyChangeAlgoritm {
    public static void main(String[] args) {
//        Создание объекта
        Scanner scanner = new Scanner(System.in);
//        Данные о сдаче
        System.out.print("Ваша сумма к оплате: ");
        int change = scanner.nextInt();
        int[] denominations = {5000, 1000, 500, 100, 50, 10, 5, 2, 1};

//        Цикл выдачи сдачи
        for (int el : denominations) {
            int totalBanknotes = change / el;
//            2336 / 5000 = 0
//            2336 / 1000 = 2
            change = change % el;
//            2336 / 1000 = 336
//            336 / 100 = 36

            String banknoteType = switch (el) {
                case 10, 5, 2, 1 -> "монету";
                default -> "купюру";
            };

            if (totalBanknotes != 0) {
                System.out.println("Вам, необходмио дать " + banknoteType + " наминалом " + el + ": " + totalBanknotes);
            }

        }
    }
}
