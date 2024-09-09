// program to reverse a positive number.

import java.util.Scanner;

public class RevPosNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number to reverse: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        System.out.println("Reversed number: " + rev);
        sc.close();
    }
}
