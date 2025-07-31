package basicprgs;
import java.util.Scanner;

public class  Question_3 {
    public static void main(String[] args) {
        int intVal = 123456;

        long longVal = intVal;

        float floatVal = longVal;

        System.out.println("Original int value   : " + intVal);
        System.out.println("After long conversion: " + longVal);
        System.out.println("After float conversion: " + floatVal);

        if (intVal == (int) floatVal) {
            System.out.println("✅ No data is lost during conversion.");
        } else {
            System.out.println("❌ Data is lost during conversion.");
        }
    }
}
