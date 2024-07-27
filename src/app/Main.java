package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Створюємо Scanner для отримання значення суми прибутку
        //Виводимо користувацький рядок для введення даних
        Scanner profitAmount = new Scanner(System.in);
        System.out.println("Enter the amount of income: ");

        //Ініціалізуємо змінну та присвоюємо їй значення, яке введе користувач
        double profit = profitAmount.nextInt();
        //Ініціалізуємо змінну для розрахунку суми податку
        double tax;

        //Розраховуємо податок із суми доходів
        //Виводимо значення, враховуючи діапазон суми доходів
        if (profit <= 10000) {
            tax = profit * 2.5 / 100;
            System.out.println("Tax = " + tax);
        } else if (profit <= 25000) {
            tax = profit * 4.3 / 100;
            System.out.println("Tax = " + tax);
        } else {
            tax = profit * 6.7 / 100;
            System.out.println("Tax = " + tax);
        }
        //Закриваємо Scanner
        profitAmount.close ();
    }
}
