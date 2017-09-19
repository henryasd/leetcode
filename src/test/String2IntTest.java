import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Henry on 2017/7/16.
 */
public class String2IntTest {
    @Test
    public void myAtoi() throws Exception {
        String2Int si = new String2Int();
        Assert.assertEquals(123,si.myAtoi("123"));
        Assert.assertEquals(-123,si.myAtoi("-123"));
        Assert.assertEquals(2147483647, si.myAtoi("2147483647"));
        Assert.assertEquals(0,si.myAtoi(""));
        Assert.assertEquals(-2147483648,si.myAtoi(-2147483648+""));
        Assert.assertEquals(2147483647,si.myAtoi("9223372036854775809"));
    }

}