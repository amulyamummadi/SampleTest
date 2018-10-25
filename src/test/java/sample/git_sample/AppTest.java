package sample.git_sample;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author amulya.mummadi
 *
 */
public class AppTest extends TestCase {
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	public AppTest(String testName) {
		super(testName);
	}

	public void testApp() {
		assertTrue(true);
	}
}
