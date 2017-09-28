package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction a = new jUnitFunction();
		int result = a.addNumbers(100, 200);
		assertEquals(300 , result);
	}

}
