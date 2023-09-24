/*Write a program to find the sum of the given series 1+2+3+ . . . . . .
(N terms)

        Example 1:
        Input:
        N = 1
        Output: 1
        Explanation: For n = 1, sum will be 1.*/
import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (N): ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 0) {
            System.out.println("N must be a non-negative integer.");
        } else {
            int result = sumOfSeries(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + result);
        }
    }

    public static int sumOfSeries(int n) {
        if (n < 0) {
            return -1; // Error: N must be non-negative
        } else if (n == 0) {
            return 0;
        } else {
            return n + sumOfSeries(n - 1);
        }
    }
}
