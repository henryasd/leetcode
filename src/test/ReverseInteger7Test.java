//package ;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;


/** 
* ReverseInteger7 Tester. 
* 
* @author <Authors name> 
* @since <pre>07/16/2017</pre> 
* @version 1.0 
*/ 
public class ReverseInteger7Test {
    ReverseInteger7 ri;
@Before
public void before() throws Exception {
    ri = new ReverseInteger7();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: reverse(int x) 
* 
*/ 
@Test
public void testReverse() throws Exception { 
//TODO: Test goes here...
    Assert.assertEquals(321,ri.reverse(123));
    Assert.assertEquals(-321,ri.reverse(-123));
    Assert.assertEquals(0,ri.reverse(0));
    Assert.assertEquals(1,ri.reverse(1));
    Assert.assertEquals(0,ri.reverse(2147483647));
    Assert.assertEquals(0,ri.reverse(-2147483648));
    Assert.assertEquals(1,ri.reverse(100));
    Assert.assertEquals(-1,ri.reverse(-100));

} 


} 
