import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        // Въвеждаме всички, които ще купуват билети от групата според възрастта
        System.out.println("Please enter how many standard billet do you want:");
        int standard = scanner.nextInt();
        System.out.println("Please enter how many children under 7 there are:");
        int children = scanner.nextInt();
        System.out.println("Please enter how many students are in the group:");
        int student = scanner.nextInt();
        System.out.println("Please enter how many collegian are in the group:");
        int collegian = scanner.nextInt();
        System.out.println("Please enter how many retired are int he group:");
        int retired = scanner.nextInt();
        // Тук реших да въведа стандартна цена на билета без отстъпки

        double price = 18;

        // Принтираме общата стойност с отстъпките
        System.out.println("Total price of the billets is:" + ((price*standard) +(price-(50/100)*student) + (price-(30/100)*collegian +
                (price-(10/100)*retired))));






    }
}
