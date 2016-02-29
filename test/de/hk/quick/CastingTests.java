package de.hk.quick;

import junit.framework.Assert;

import org.junit.Test;

public class CastingTests {

	@Test
	public void testStringToLong() {
		long sut = Long.valueOf("023");

		Assert.assertEquals(23, sut);

	}
}
