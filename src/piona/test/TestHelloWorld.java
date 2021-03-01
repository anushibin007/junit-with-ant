package piona.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import piona.HelloWorld;

public class TestHelloWorld {
	HelloWorld hw = new HelloWorld();

	@Test
	public void testExpectedMessage() {
		assertEquals(hw.toString(), "Hello World!");
	}
}
