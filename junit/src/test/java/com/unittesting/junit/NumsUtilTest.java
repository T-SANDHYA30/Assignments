package com.unittesting.junit;


import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized.Parameters;

public class NumsUtilTest {
	@Parameters
	@ValueSource(ints= {2,4,6,8})
	public void isEvenTest(int n) {
		assertTrue(NumsUtil.isEven(n));
	}

}
