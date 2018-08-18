package com.w3epic.wiprotraining.assignment1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MyUnitTest {

	@Test
	void testStringConcat() {
		MyUnit myUnit = new MyUnit();
		assertEquals("Result", "HelloWorld", myUnit.stringConcat("Hello", "World"));
	}

}
