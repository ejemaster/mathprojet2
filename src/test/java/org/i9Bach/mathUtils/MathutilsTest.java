package org.i9Bach.mathUtils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathutilsTest {

	@Test
	void test() {
		Mathutils test = new Mathutils();
		int output = test.Sum(8, 10);
		
		
		//int c = org.i9Bach.mathUtils.Mathutils.Sum(a,b);
		
		assertEquals(18, output);

		for(output=1; output <= test.Sum(8,10);output++)
		{
			System.out.println(output);

			if (output==test.Sum(8,10))
			{
				System.out.println("Test Passsed: Ewartet Zahl  " + output+ " Ergebnis " + test.Sum(8,10));

			}
		}
		

	}

}
