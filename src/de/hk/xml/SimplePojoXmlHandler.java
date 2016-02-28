package de.hk.xml;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import de.hk.pojo.SimplePojo;

/**
 * @Deprecated Use GenericXmlHandler
 * @author herbertpaulkoglsperger
 *
 */
public class SimplePojoXmlHandler {

	private String giveSimplePojoAsXml(SimplePojo simplePojo)
			throws JAXBException {
		/*
		 * Marshalling = konvertieren Java Object in XML-Format ( hier
		 * simplePojo -> String )
		 */
		JAXBContext context = JAXBContext.newInstance(SimplePojo.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		StringWriter stringWriter = new StringWriter();
		marshaller.marshal(simplePojo, stringWriter);
		return stringWriter.toString();
	}

	private SimplePojo giveSimplePojoFromXmlString(String xmlString)
			throws Exception {
		JAXBContext jaxbContext = JAXBContext.newInstance(SimplePojo.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

		/*
		 * unmarshalling = Konvertierung XML nach Java Object ( hier
		 * KollektivVertragsKundenDaten(Liste) )
		 */
		SimplePojo simplePojo = (SimplePojo) jaxbUnmarshaller
				.unmarshal(new StringReader(xmlString));

		return simplePojo;
	}

}
