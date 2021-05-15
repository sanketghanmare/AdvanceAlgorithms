package learn.advance.programming.euclid;

import learn.advance.euclidAlgorithm.Euclid;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EuclidTest {

    Euclid e = null;

    @Before
    public void init() {
      e = new Euclid();
    }

    @Test
    public void gcdTest(){
        Assert.assertEquals(2, e.gcd(22,6));
        Assert.assertEquals(2, e.gcd(10,2));

    }

    @Test
    public void gcdNonRecursive(){
        Assert.assertEquals(2, e.gcdNonRecursive(22,6));
        Assert.assertEquals(2, e.gcdNonRecursive(10,2));
        Assert.assertEquals(1, e.gcdNonRecursive(11,3));
        Assert.assertEquals(1, e.gcdNonRecursive(79,32));
    }

    @Test
    public void gcdRecursiveVsNonRecursive(){
        Assert.assertEquals(e.gcd(22,6),e.gcdNonRecursive(22,6));
    }

}
