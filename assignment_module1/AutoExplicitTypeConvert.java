class AutoExplicitTypeConvert {
    public static void main(String args[]) {
        float a = 105.3f;
        short b = 128;
        // automatic type conversion (float to double)
        double doubleSum = a + b;
        System.out.println("Auto Sum: " + doubleSum);
        // explicit type conversion (double to float)
        float floatSum = (float) (a + b);
        System.out.println("Explicit Sum: " + floatSum);
    }
}