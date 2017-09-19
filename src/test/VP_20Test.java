import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Henry on 2017/7/28.
 */
public class VP_20Test {
    @Test
    public void isValid() throws Exception {
        VP_20 vp_20 = new VP_20();
        Assert.assertEquals(true, vp_20.isValid("([])"));

    }

}