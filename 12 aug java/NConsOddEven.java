//program to find average of consecutive N Odd numbers and even numbers.

import java.util.Scanner;

public class NConsOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int oddSum = 0;
        int evenSum = 0;
        int oddCount = 0;
        int evenCount = 0;
        int i = 1;
        while (oddCount < n || evenCount < n) {
            if (i % 2 == 0) {
                evenSum += i;
                evenCount++;
            } else {
                oddSum += i;
                oddCount++;
            }
            i++;
        }
        System.out.println("Average of first " + n + " odd numbers: " + (oddSum / n));
        System.out.println("Average of first " + n + " even numbers: " + (evenSum / n));
        sc.close();
    }
}
