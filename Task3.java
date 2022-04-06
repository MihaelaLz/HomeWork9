import java.util.Scanner;
// Задачата я написах така, че да ми смята мога ли да купя зеленчуците, които искам за да си направя салата,
//колко грама салата излиза и за колко пари

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Въвеждаме едно след друго количеството зеленчуци и сирене, които искаме да купим.
        System.out.println("How many tomato do you have in kg?");
        double tomato = scanner.nextDouble();
        System.out.println("How many cucumber do you have in kg?");
        double cucumber = scanner.nextDouble();
        System.out.println("How many pepper do you have in kg?");
        double pepper = scanner.nextDouble();
        System.out.println("How many cheese do you have in kg?");
        double cheese = scanner.nextDouble();
        System.out.println("How many onion do you have in kg?");
        double onion = scanner.nextDouble();
     // Общо колко тежат всички зеленчуци
        double allVegetables = tomato + onion + cheese + cucumber + pepper;

     // Цена на зеленчуците
        double priceOfOnion = onion * 3;
        double priceOfCheese = cheese * 15;
        double priceOfTomato = tomato * 7;
        double priceOfPepper = pepper * 5;
        double priceOfCucumber = cucumber * 6;
     //Колко общо е сметката ми
        double bill = priceOfCucumber + priceOfCheese + priceOfPepper + priceOfTomato + priceOfOnion;
        double budget = 20;

        System.out.printf("Total kg of vegetables is:" + "%.2f%n",allVegetables );

        System.out.printf("Your bill is:" + "%.2f%n",bill);
        // Тук правя проверка за да не се въвеждат отрицателни числа
        boolean isValid = pepper > 0 && tomato > 0 && onion > 0 && cucumber > 0 && cheese > 0;

        if (isValid) {
            if (bill > budget) {
                System.out.println("Sorry you cannot make a salad, you don`t have enough money!");
                System.out.println("Try to return some vegetables.");
            } else {
                System.out.println("You can make a salad.");
            }
        }else{
            System.out.println("You have entered a minus kilograms of some vegetable, try again!");
        }
    }
}
