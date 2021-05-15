package learn.advance.programming.utils;

import learn.advance.utils.SimpleUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleUtilsTest {
    SimpleUtils utils = null;

    @Before
    public void init() {
        utils = new SimpleUtils();
    }
    @Test
    public void stringTooBooleanTrueTest() {
        Assert.assertTrue(utils.stringToBoolean("y"));
        Assert.assertTrue(utils.stringToBoolean("Y"));
        Assert.assertTrue(utils.stringToBoolean("yEs"));
        Assert.assertTrue(utils.stringToBoolean("YES"));
        Assert.assertTrue(utils.stringToBoolean("true"));
        Assert.assertTrue(utils.stringToBoolean("True"));

    }

    @Test
    public void stringTooBooleanFalseTest() {
        Assert.assertFalse(utils.stringToBoolean("n"));
        Assert.assertFalse(utils.stringToBoolean("N"));
        Assert.assertFalse(utils.stringToBoolean("no"));
        Assert.assertFalse(utils.stringToBoolean("nO"));
        Assert.assertFalse(utils.stringToBoolean("NO"));
        Assert.assertFalse(utils.stringToBoolean("False"));
        Assert.assertFalse(utils.stringToBoolean("false"));
        Assert.assertFalse(utils.stringToBoolean("zebra"));
        Assert.assertFalse(utils.stringToBoolean(null));
    }

    @Test
    public void getFileTypeByCode() {
        Assert.assertEquals(SimpleUtils.FileType.PDF, utils.getFileTypeByCode(3));
        Assert.assertEquals(SimpleUtils.FileType.JPEG, utils.getFileTypeByCode(1));
    }

    @Test
    public void getFileTypeByName() {
        Assert.assertEquals(SimpleUtils.FileType.TEXT, utils.getFileTypeByName("txt"));
        Assert.assertNull(utils.getFileTypeByName("zebre"));
        Assert.assertNull(utils.getFileTypeByName(null));

    }


}
