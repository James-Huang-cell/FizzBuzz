package lab1;

public class Multiples {

    // Overloaded method (no arguments, default case)
    public static int multiples() {
        return multiples(1000, 3, 5);
    }

    // General method
    public static int multiples(int n, int a, int b) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                sum += i; // add the number itself, not just +1
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(multiples()); // should print 233168
    }
}
