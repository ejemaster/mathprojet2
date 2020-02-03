package org.i9Bach.mathUtils;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

public class Test4 {
	

	@Test
	void test4() {

		MathFunktion test4 = new MathFunktion();
		int output = test4.Mod(7, 2);
		assertNotEquals(0, output);
		for(output=0; output <= test4.Mod(7,2);output++)
		{
			System.out.println(output);

			if (output==test4.Mod(7,2))
			{
				System.out.println("Test Passsed: Ewartet Zahl  " + output+ " Ergebnis " + test4.Mod(7,2));

			}
		}
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
