import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Henry on 2017/7/16.
 */
public class RegularExpressionMatchf10Test {
    @Test
    public void isMatch() throws Exception {
        RegularExpressionMatchf10 rem = new RegularExpressionMatchf10();
        Assert.assertEquals(false,rem.isMatch("aa","a"));
        Assert.assertEquals(true, rem.isMatch("aa", "aa"));
        Assert.assertEquals(false, rem.isMatch("aaa","aa"));
        Assert.assertEquals(true, rem.isMatch("aa", "a*"));
        Assert.assertEquals(true, rem.isMatch("aa", ".*"));
        Assert.assertEquals(true, rem.isMatch("ab", ".*"));
        Assert.assertEquals(true, rem.isMatch("aab", "c*a*b"));

    }

}