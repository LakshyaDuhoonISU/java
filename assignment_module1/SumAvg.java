// program to find sum and average 1 to 10
public class SumAvg {
    public static void main(String[] args) {
        int sum = 0;
        float avg = 0.0f;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            avg = (float) (avg + i);
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg / 10);
    }
}
