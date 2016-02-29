package de.hk.ascii;

import org.junit.Test;

public class BannerTest {

	@Test
	public void testSimple() throws Exception {

		String s1 = "Müller";
		byte[] b1 = s1.getBytes("UTF-8");

		byte[] b2 = { (byte) 99, (byte) 97, (byte) 116 };
		String s2 = new String(b1, "US-ASCII");

		System.out.println(s2);

	}

	// http://programmierblog.blogspot.de/2009/02/string-mit-umlauten-in-bytes-umwandeln.html
	@Test
	public void zweiterTest() throws Exception {
		// ohne encoding umwandeln
		byte[] bytes = "AÄÖÜäöüßA".getBytes();
		System.out.printf("%d bytes (Länge 9)\n", bytes.length);
		for (byte b : bytes) {
			System.out.printf("%02x ", b);
		}
		System.out.println(new String(bytes));
	}
}
