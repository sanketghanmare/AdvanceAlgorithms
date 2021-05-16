package learn.advance.rabinkarp;

/**
 * Rabin-karp algorithm it uses hashing to find a match between patterns and array of chars
 * Uses rolling hash function to recalculate the hash on the subsequent possible matches.
 *
 * It will return the index of the match in the array.
 * It will -1 if there is no match.
 */
public class RabinKarp {

    private final int prime = 3;

    /**
     *  learning = 8
     *  nin = 3
     *
     * @param array
     * @param pattern
     * @return
     */
    public int search(char[] array, char[] pattern) {
        if (array == null || pattern == null) return -1;

        int n = array.length;
        int m = pattern.length;
        int lastChar = (n - m);

        long patternHash = calculateHash(pattern, m);
        long arrayHash =   calculateHash(array, m);

        for (int i = 0; i <= lastChar; i++) {
            if (patternHash == arrayHash && match(array,pattern,i)) {
                return i;
            }

            if (i < lastChar) {
                arrayHash = recalculateHash(arrayHash, array[i], array[i+m], m);
            }
        }

        return -1;
    }

    public boolean match(char[] array,char[] pattern, int index) {
        for (int i = 0; i < pattern.length; i++) {
            if (array[index+i] != pattern[i]) return false;
        }

        return true;
    }


    public long recalculateHash(long oldHash, char oldChar, char newChar, int hashSize) {

        long hash = oldHash - charValue(oldChar);
        hash = hash/prime;
        hash += charValue(newChar) * Math.pow(prime, hashSize - 1);
        return hash;
    }

    public long calculateHash(char[] text, int hashSize) {
        long hash = 0;
        for (int i =0; i < hashSize; i++) {
            hash += charValue(text[i]) * Math.pow(prime, i);
        }
        return hash;
    }

    public int charValue(char val) {
        return val - 96;
    }

}
