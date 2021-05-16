package learn.advance.programming.bruteforce;

import learn.advance.bruteforce.BruteForce;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BruteForceTest {

    BruteForce b = null;
    char[] array;

    @Before
    public void init() {
        b = new BruteForce();
        String s = new String("learn.advance.algorithm.programming");
        array = s.toCharArray();
    }

    @Test
    public void firstMatchTest() {

        Assert.assertEquals(0, b.firstMatch(array, new char[]{'l'}));
        Assert.assertEquals(14, b.firstMatch(array, new char[]{'a','l','g','o','r','i','t','h','m'}));
        Assert.assertEquals(-1, b.firstMatch(array, new char[]{'z'}));
    }

    @Test
    public void everyMatchTest() {
        int[] expect = new int[array.length];
        Arrays.fill(expect, -1);
        expect[0] = 0;
        expect[1] = 15;
        int [] found = b.everyMatch(array, new char[]{'l'});
        Assert.assertArrayEquals(expect, found);
    }

}
