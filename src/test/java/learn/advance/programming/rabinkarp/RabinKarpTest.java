package learn.advance.programming.rabinkarp;

import learn.advance.rabinkarp.RabinKarp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RabinKarpTest {
    RabinKarp r = null;

    @Before
    public void init() {
        r = new RabinKarp();
    }

    @Test
    public void searchTest() {
        Assert.assertEquals(3,r.search("acbacc".toCharArray(),"acc".toCharArray()));
        Assert.assertEquals(4,r.search("learning".toCharArray(),"nin".toCharArray()));
        Assert.assertEquals(-1,r.search("learning".toCharArray(),"nimo".toCharArray()));
        Assert.assertEquals(0,r.search("learning".toCharArray(),"le".toCharArray()));
        Assert.assertEquals(0,r.search("learning".toCharArray(),"l".toCharArray()));
        Assert.assertEquals(5,r.search("learning".toCharArray(),"ing".toCharArray()));
        Assert.assertEquals(-1,r.search("learning".toCharArray(),null));
        Assert.assertEquals(-1,r.search(null,"ing".toCharArray()));
        Assert.assertEquals(-1,r.search(null,null));
    }

    @Test
    public void matchTest() {
        Assert.assertTrue(r.match("learning".toCharArray(), "nin".toCharArray(),4));
        Assert.assertTrue(r.match("learning".toCharArray(), "le".toCharArray(),0));
        Assert.assertTrue(r.match("learning".toCharArray(), "g".toCharArray(),7));
        Assert.assertFalse(r.match("learning".toCharArray(), "zzz".toCharArray(),2));
        Assert.assertFalse(r.match("learning".toCharArray(), "ing".toCharArray(),4));
    }

    @Test
    public void calculateHashTest() {
        Assert.assertEquals(28L, r.calculateHash("acbacc".toCharArray(), 3));
    }

    @Test
    public void recalculateHashTest() {
        Assert.assertEquals(18L, r.recalculateHash(28L, 'a', 'a', 3));
    }

    @Test
    public void charValTest() {
         Assert.assertEquals(97, (int)'a');
         Assert.assertEquals(1, r.charValue('a'));
    }

}
