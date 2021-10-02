package HelloMaven.hellomaven;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import com.beust.testng.TestNG;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestNG
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( );
    }

    /**
     * Rigourous Test :-)
     */
    @Test
	public void testApp()
    {
        AssertJUnit.assertTrue( true );
    }
}
