// program to find greater number between 2 using conditional operator

import java.util.Scanner;

public class NumCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        int result = first > second ? first : second;
        System.out.println(result + " is greater");
        sc.close();
    }
}
