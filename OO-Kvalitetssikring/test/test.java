import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;


public class test {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testIplusIIEqualsIII() {
		
		// 3. setup
		Romertal romertal1;
		
		// 2. Execution
		romertal1 = new Romertal("I");
		
		assertEquals(romertal1.add("I", "II"), "III");
	}

	
}
