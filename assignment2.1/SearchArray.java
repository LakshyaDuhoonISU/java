//Q22

import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
