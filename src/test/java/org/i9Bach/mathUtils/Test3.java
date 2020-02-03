package org.i9Bach.mathUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Test3 {
	
	@Test
	void test3() {

		MathFunktion test3 = new MathFunktion();
		int output = test3.Div(20, 2);
		assertTrue(output==10);
		for(output=1; output <= test3.Div(20, 2);output++)
		{
			System.out.println(output);

			if (output==test3.Div(20, 2))
			{
				System.out.println("Test Passsed: Ewartet Zahl  " + output+ " Ergebnis " + test3.Div(20, 2));

			}
		}

	}

}
