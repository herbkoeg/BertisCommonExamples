package de.hk.xml;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import de.hk.pojo.SimplePojo;

public class GenericXmlHandlerTest {

	private GenericXmlHandler sut = null;

	@Before
	public void init() {
		sut = new GenericXmlHandler();
	}

	@Test
	public void ersterTest() throws Exception {

		// marshalling
		SimplePojo simplePojo = new SimplePojo();
		simplePojo.setBemerkung("jawoi");

		String xmlString = sut.convertObjectToXML(simplePojo);

		System.out.println(xmlString);

		// unmarshalling
		SimplePojo simplePojo2 = sut.convertXMLToObject(SimplePojo.class,
				xmlString.replace("jawoi", "jamö"));
		Assert.assertEquals("jamö", simplePojo2.getBemerkung());
	}

	@Test
	public void exceptionErwartet() {
		Assert.fail("ToDo");
	}

	@Test
	public void testMitDate() {
		Assert.fail("ToDo");
	}

	@Test
	public void testMitListe() {
		Assert.fail("ToDo");
	}

}
