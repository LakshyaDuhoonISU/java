// program to find greatest among three numbers using if else

import java.util.Scanner;

public class NumAmong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        System.out.print("Enter third number: ");
        int third = sc.nextInt();
        if (first > second && second > third) {
            System.out.println(first + " is greatest");
        } else if (second > first && second > third) {
            System.out.println(second + " is greatest");
        } else {
            System.out.println(third + " is greatest");
        }
        sc.close();
    }
}
