package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 1;
        while (i < 100) {
            System.out.println(doFizzBuzz(i));
            i++;
        }
    }

    private static String doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        if (divisibleBy3 && divisibleBy5) {
            return "Fizz Buzz" ;
        }
        else if (divisibleBy3) {
            return "Fizz";
        }
        else if (divisibleBy5) {
            return "Buzz";
        }
        else {
            return String.valueOf(i);
        }
    }
}
