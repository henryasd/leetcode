import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Henry on 2017/7/30.
 */
public class Divide2Int_29Test {
    @Test
    public void divide() throws Exception {
        Divide2Int_29 divide2Int_29 = new Divide2Int_29();
        Assert.assertEquals(Integer.MAX_VALUE, divide2Int_29.divide(-2147483648,-1));


    }

}