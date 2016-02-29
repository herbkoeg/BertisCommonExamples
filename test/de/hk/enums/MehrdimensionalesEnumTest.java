package de.hk.enums;

import org.junit.Assert;
import org.junit.Test;

import de.hk.exception.BeispielException;


public class MehrdimensionalesEnumTest 
{
	
	@Test
	public void simpleEnumTest() throws BeispielException
	{
		Assert.assertEquals(MehrdimensionalesEnum.LEBENSVERSICHERUNG, MehrdimensionalesEnum.createWagnisart(1l));
		Assert.assertEquals(MehrdimensionalesEnum.BUVERSICHERUNG, MehrdimensionalesEnum.createWagnisart(2l));
		Assert.assertEquals(MehrdimensionalesEnum.PFLEGEVERSICHERUNG, MehrdimensionalesEnum.createWagnisart(3l));
		
		Assert.assertEquals("Lebens- oder Rentenversicherung mit Todesfallrisiko", MehrdimensionalesEnum.createWagnisart(1).getName());
	}

}
