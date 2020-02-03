package org.i9Bach.mathUtils;

import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.junit.jupiter.api.Test;

public class Test6 {
	
	@Test
	void test6() {
		
		MathFunktion test6 = new MathFunktion();
		String Output = test6.Name("Ejangue Guillaume");
		assertNotSame("Master", Output, " Geben Sie eine String anders als Ejangue Guillaume");

		System.out.println(Output);
	}

}
