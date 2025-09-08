package lab1;

public class Multiples {

    public static int multiples() {

        int count = 0;
        for (int i = 1; i < 1000; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {
                count = count + 1;
            } else if (divisibleBy3) {
                count = count + 1;
            } else if (divisibleBy5) {
                count = count + 1;
            } else {
                count = count + 0;
            }

        }
    }
}
