import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Henry on 2017/7/16.
 */
public class PalindromeNumber9Test {
    @Test
    public void isPalindrome() throws Exception {
        PalindromeNumber9 pn = new PalindromeNumber9();
        Assert.assertEquals(false, pn.isPalindrome(-123));
        Assert.assertEquals(true,pn.isPalindrome(0));
        Assert.assertEquals(true,pn.isPalindrome(11));
        Assert.assertEquals(true,pn.isPalindrome(123454321));
        Assert.assertEquals(true,pn.isPalindrome(12344321));
        Assert.assertEquals(false,pn.isPalindrome(12345321));

    }

}