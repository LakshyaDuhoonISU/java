// average of 1d array

public class ArrEx {
    public static void main(String[] args) {
        double arr[] = { 10.1, 11.2, 12.3, 13.4, 14.5 };
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println("Average is " + result / arr.length);
    }
}
