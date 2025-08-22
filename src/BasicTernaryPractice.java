import java.util.Scanner;

public class BasicTernaryPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: "); // Enter first number
        int a = input.nextInt();
        System.out.print("Enter another number: "); // Enter second number
        int b = input.nextInt();

        System.out.println("Max of " + a + " and " + b + " is " + findMaximum(a, b)); // Max of a & b

        System.out.println("Max of 15 and 23: " + findMaximum(15, 23));
        System.out.println("Max of 100 and 50: " + findMaximum(100, 50));
        System.out.println("Max of -5 and -10: " + findMaximum(-5, -10));
    }

    public static int findMaximum(int a, int b) {
        return a > b ? a : b;
    }
}