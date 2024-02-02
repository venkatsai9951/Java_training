
import java.util.Scanner;

public class Roman1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 3999) {
            String romanNumeral = convertToRoman(number);
            System.out.println("Roman numeral: " + romanNumeral);
        } else {
            System.out.println("Please enter a number between 1 and 3999.");
        }

        scanner.close();
    }

    private static String convertToRoman(int num) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] numerals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(numerals[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }
}
