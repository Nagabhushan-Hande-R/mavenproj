package mavenforjenkins;

import org.junit.Before;
import org.junit.Test;

public class MathServiceTest {
	private MathService mathService;

	@Before
	public void setUp() {

		mathService = new MathService();
	}

	@Test(expected = Test.None.class)
	public void multipliesNumbers() {

		assert(mathService.multiply(2, 4) == 8);
		assert(mathService.multiply(2, 0) == 0);
	}
}
