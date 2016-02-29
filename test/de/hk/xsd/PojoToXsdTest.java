package de.hk.xsd;

import javax.xml.bind.JAXBContext;

import org.junit.Test;

import de.hk.generics.MyRequestBean_1;

public class PojoToXsdTest {
	@Test
	public void erzeugeMyRequestBean1() throws Exception {
		JAXBContext context = JAXBContext.newInstance(MyRequestBean_1.class);
		PojoToXsd.pojoToXSD(context, new MyRequestBean_1(), System.out);
	}

}
