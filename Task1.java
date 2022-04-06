import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Въвеждаме страните, като уточняваме и мерната единица
        System.out.println("Please enter the length of 'a' in cm:");
        int a = scanner.nextInt();
        System.out.println("Please enter the length of 'b' in cm:");
        int b = scanner.nextInt();
        //Правим проверка да не се въвеждат отрицателни числа или равни на 0
        boolean isValid = a > 0 && b > 0;

        if (isValid) {
            if (a == b) {
                System.out.println("The figure is a square.");
                //Формулата за лице на квадрат е : S = a.а
                //Формулата за обиколка на квадрат  : P = 4.а

                double area = a * b;

                double perimeter = 4 * a;

                //Резултат:

                System.out.println("Perimeter of the figure is: " + perimeter + "cm");

                System.out.println("Area of the figure is: " + area + "cm2");
            }
            else {
                //Формулата за лице на правоъгълник е : S = a.b
                // Формулата за обиколка на правоъгълник е: P = 2.(a+b)
                double area1 = a*b;
                double perimeter1 = 2*(a+b);

                System.out.println("The figure is a rectangle.");
                System.out.println("Perimeter of the figure is:" + perimeter1 + "cm" );
                System.out.println("Area of the figure is: " + area1 + "cm2");
            }


        }else  {
            System.out.println("Invalid!");

        }
    }
}
