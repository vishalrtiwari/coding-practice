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

    /**
     * Calculates Fibbonacci number at given position
     * @param pos position for which number has to be calculated
     * @return fibbonacci number
     */
    public static int fib(int pos) {
        if(pos == 1 || pos == 0) {
            return 1;
        }
        else if(pos>1) {
            return fib(pos - 1) + fib(pos - 2);
        }
        return 1;

    }

    public static void main(String[] args) {
        System.out.println("factorial of 5 = " + factorial(5));
        System.out.println("Fab ="+fib(0));
    }
}
