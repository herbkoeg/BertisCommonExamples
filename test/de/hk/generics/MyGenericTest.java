package de.hk.generics;

import org.junit.Assert;
import org.junit.Test;

public class MyGenericTest {

	@Test
	public void doSimpleTest_MyService1() {
		MyRequestBean_1 myRequestBean_1 = new MyRequestBean_1();
		myRequestBean_1.setBeitrag(1500.0d);
		MyService_1 myService_1 = new MyService_1();
		Assert.assertEquals(1600.0d, myService_1.doSomeThing(myRequestBean_1)
				.getAblaufleistung().doubleValue(), 0.0d);
	}

	@Test
	public void doSimpleTest_MyService2() {
		MyRequestBean_2 myRequestBean_2 = new MyRequestBean_2();
		myRequestBean_2.setLeistung(1500.0d);
		MyService_2 myService_2 = new MyService_2();
		Assert.assertEquals(1700.0d, myService_2.doSomeThing(myRequestBean_2)
				.getAblaufleistung().doubleValue(), 0.0d);
	}

}
