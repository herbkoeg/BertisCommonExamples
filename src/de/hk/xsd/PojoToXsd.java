package de.hk.xsd;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public abstract class PojoToXsd {
	static public void pojoToXSD(JAXBContext context, Object pojo,
			OutputStream out) throws IOException, TransformerException {
		final List<DOMResult> results = new ArrayList<DOMResult>();

		context.generateSchema(new SchemaOutputResolver() {

			@Override
			public Result createOutput(String ns, String file)
					throws IOException {
				DOMResult result = new DOMResult();
				result.setSystemId(file);
				results.add(result);
				return result;
			}
		});

		DOMResult domResult = results.get(0);
		Document doc = (Document) domResult.getNode();

		// Use a Transformer for output
		TransformerFactory tFactory = TransformerFactory.newInstance();
		Transformer transformer = tFactory.newTransformer();

		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(out);
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.transform(source, result);
	}

}
