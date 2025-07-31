package basicprgs;

import java.util.Scanner;

public class Question_5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        int asciiVal = (int) ch;

        System.out.println("Entered character     : " + ch);
        System.out.println("ASCII value (integer) : " + asciiVal);

        scanner.close();
    }
}
