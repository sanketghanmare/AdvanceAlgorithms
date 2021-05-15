package learn.advance.euclidAlgorithm;

/**
 * Euclid Algorithm
 * It calculates the Greatest Common Divisor between two number A and B.
 */
public class Euclid {

    /**
     * Implementation using recursion
     * Ex:- 22/6 = 3 rest of 4
     * 6/4 = 1 rest of 2
     * 4/2 = 2 rest of 0
     *
     * @param number
     * @param divisor
     * @return number
     */
    public int gcd(int number, int divisor) {

        int remaining = (number % divisor);

        if (remaining != 0) {
            return gcd(divisor, remaining);
        }

        return divisor;

    }

    /**
     * Implementation without recurssion
     * Ex:- 22/6 = 3 rest of 4
     * *         6/4 = 1 rest of 2
     * *         4/2 = 2 rest of 0
     * <p>
     * number/temp = result rest of divisor
     *
     * @param number
     * @param divisor
     * @return
     */
    public int gcdNonRecursive(int number, int divisor) {

        while (divisor != 0) {
            int temp = divisor;
            divisor = (number % divisor);
            number = temp;
        }

        return number;

    }
}