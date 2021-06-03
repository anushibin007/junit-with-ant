package piona.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import piona.SumOfTwoNumbers;

public class TestSumOfTwoNumbers {
	SumOfTwoNumbers sotw = new SumOfTwoNumbers();

	@Test
	public void testSum() {
		assertEquals(5, sotw.sum(2, 3));
	}
}
