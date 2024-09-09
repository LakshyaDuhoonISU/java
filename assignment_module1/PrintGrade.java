// program to print grade using switch case(A>75, 60<B<=75, 40<C<=60, F<40)

import java.util.Scanner;

public class PrintGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        int result = marks / 10;
        switch (result) {
            case 10:
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println("Grade C");
                break;
            case 6:
                System.out.println("Grade D");
                break;
            case 5:
                System.out.println("Grade E");
                break;
            default:
                System.out.println("Grade F");
        }
        sc.close();
    }
}
