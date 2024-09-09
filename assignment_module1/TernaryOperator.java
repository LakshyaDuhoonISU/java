// program to find greater among 3 numbers using conditional operator

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        System.out.print("Enter third number: ");
        int third = sc.nextInt();
        int result = first > second ? first > third ? first : third : second > third ? second : third;
        System.out.println(result + " is greatest");
        sc.close();
    }
}
