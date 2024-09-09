// program to check whether the inputted number is Armstrong Number or not.

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem * rem * rem;
            num /= 10;
        }
        if (temp == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
        sc.close();
    }
}
