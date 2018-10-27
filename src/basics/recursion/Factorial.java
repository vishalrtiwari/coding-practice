package basics.recursion;


public class Factorial {
    /**
     * Calculates factorial
     * @param number number for which factorial to be calculated as int
     * @return int
     */
    public static int factorial(int number) {
        if(number == 1) {
            return 1;
        } else if (number > 1) {
            return number * factorial(number - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("factorial of 5 = " + factorial(5));
    }
}
