import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {
    @Test
    public void test_1(){
        assertTrue(Demo.isTriangle(3,4,5));
    }

}
