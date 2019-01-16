import static org.junit.Assert.*;

import org.junit.Test;

public class perfectlybalancedtest {

	@Test
	public void test() {
		balanced b = new balanced();
		
		assertTrue(b.isBalanced("xxxyyy"));
		assertTrue(b.isBalanced("yyyxxx"));
		
		assertFalse(b.isBalanced("xxxyyyy"));
		assertTrue(b.isBalanced("yyxyxxyxxyyyyxxxyxyx"));
		assertFalse(b.isBalanced("xyxxxxyyyxyxxyxxyy"));
		
		assertTrue(b.isBalanced(""));
		assertTrue(b.isBalanced("x"));
	}

}
