package basicprgs;

import java.util.Scanner;

public class Question_10
{
    final static int DIVISOR_3 = 3;
    final static int DIVISOR_5 = 5;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % DIVISOR_3 == 0 && number % DIVISOR_5 == 0)
        {
            System.out.println(number + " is divisible by both 3 and 5.");
        }
        else
        {
            System.out.println(number + " is NOT divisible by both 3 and 5.");
        }

        scanner.close();
    }
}
