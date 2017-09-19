//package ;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* CWMW11 Tester. 
* 
* @author <Authors name> 
* @since <pre>07/24/2017</pre> 
* @version 1.0 
*/ 
public class CWMW11Test { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: maxArea(int[] height) 
* 
*/ 
@Test
public void testMaxArea() throws Exception { 
//TODO: Test goes here...
    CWMW11 cwmw11 = new CWMW11();
    Assert.assertEquals(1, cwmw11.maxArea(new int[]{1, 1}));
    Assert.assertEquals(2, cwmw11.maxArea(new int[]{1, 2, 3}));
} 


} 
