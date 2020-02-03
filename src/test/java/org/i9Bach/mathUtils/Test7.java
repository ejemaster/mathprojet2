package org.i9Bach.mathUtils;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class Test7 {

	@Test
	public void test7() {
		MathFunktion test7 = new MathFunktion();
		
		int output = test7.Alt(28);
		assertSame(28, output);

		if(output<=17)
		{
			System.out.println("Du bist minderjaehrig");
		}
		else if(output>=28)
		{
			System.out.println("du bist 28 oder aelter");
		}
		else
		{
			System.out.println("du bist gerade geboren");
		}
	}

}
