import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Henry on 2017/7/24.
 */
public class LongestCommonPrefix14Test {
    @Test
    public void longestCommonPrefix() throws Exception {
        LongestCommonPrefix14 lcp = new LongestCommonPrefix14();
        Assert.assertEquals("",lcp.longestCommonPrefix(new String[]{""}));

    }

}