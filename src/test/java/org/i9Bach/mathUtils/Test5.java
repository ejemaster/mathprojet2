package org.i9Bach.mathUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

public class Test5 {
	
	@Test
	void test5() {
		MathFunktion test5 = new MathFunktion();
		int output = test5.Sub(15, 10);



		assertTrue(output-10!=0);
		for(output=1; output <= test5.Sub(15,10);output++)
		{
			System.out.println(output);

			if (output==test5.Sub(15,10))
			{
				System.out.println("Test Passsed: Ewartet Zahl  " + output+ " Ergebnis " + test5.Sub(15,10));

			}
		}
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
