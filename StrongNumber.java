package day11;
import java.util.*;

public class StrongNumber {

    static int fact(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static boolean isStrong(int n) {
        int sum = 0;
        int original = n;
        while (n != 0) {
            int digit = n % 10;
            sum += fact(digit);
            n = n / 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isStrong(n));
    }
}
