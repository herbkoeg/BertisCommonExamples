package de.hk.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Assert;
import org.junit.Test;

public class MyBigDecimalTest {

	@Test
	public void testBigDecimal() {
		BigDecimal myBd = new BigDecimal(1234567.89823d).setScale(2,
				RoundingMode.DOWN);
		Assert.assertEquals("1234567.89", myBd.toString());
		myBd = new BigDecimal(1234567.89823d).setScale(2, RoundingMode.UP);
		Assert.assertEquals("1234567.90", myBd.toString());
	}
}
