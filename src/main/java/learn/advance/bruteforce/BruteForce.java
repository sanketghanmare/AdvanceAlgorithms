package learn.advance.bruteforce;

import java.util.Arrays;

/**
 * Brute Force Algorithm
 *
 *  It will search for a pattern in an array and if the pattern is found it will return the index of the array where
 *  the pattern is found and if no pattern is found it will return -1.
 */
public class BruteForce {

    /**
     * Method searches for the pattern into an array and return the index of the first char that matches.<BR>
     *     If no match is found it will return -1.
     *
     * array = abcdef
     * pattern = def -> 4
     *
     * @param array
     * @param pattern
     * @return
     */
    public int firstMatch(char[] array, char[] pattern) {

        for (int a = 0; a <= array.length - pattern.length; a++) {
            for (int p = 0; p < pattern.length; p++) {
                if (array[a+p] != pattern[p]) break;
                if (p == pattern.length - 1) return a;
            }
        }
        return -1;
    }

    /**
     * This method searches for a pattern into an array and return an array of int with  the indexes of element found.
     * @param array
     * @param pattern
     * @return array of indexes
     */
    public int[] everyMatch(char[] array, char[] pattern) {
        int[] found =  new int[array.length];
        Arrays.fill(found,-1);
        int index = 0;
        for (int a = 0; a < array.length - pattern.length; a++) {
            for (int p = 0; p < pattern.length; p++) {
                if (array[a+p] != pattern[p]) break;
                if (p == pattern.length - 1) {
                    found[index++] = a;
                }
            }
        }
        return found;
    }


}
