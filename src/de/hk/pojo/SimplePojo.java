package de.hk.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Guido")
@XmlAccessorType(XmlAccessType.FIELD)
/**
 * @see https://jaxb.java.net/tutorial/index.html
 * @author herbertpaulkoglsperger
 *
 */
public class SimplePojo {

	@XmlElement(name = "myBR")
	private int bruttoBeitrag;

	@XmlElement(name = "nettoBeitrag")
	private int nettoBeitrag;

	@XmlElement(name = "vnr")
	private int vnr;

	@XmlElement(name = "bemerkung")
	private String bemerkung;

	public SimplePojo() {
		super();
	}

	public SimplePojo(int bruttoBeitrag, int nettoBeitrag, int vnr,
			String bemerkung) {
		super();
		this.bruttoBeitrag = bruttoBeitrag;
		this.nettoBeitrag = nettoBeitrag;
		this.vnr = vnr;
		this.bemerkung = bemerkung;
	}

	public int getBruttoBeitrag() {
		return bruttoBeitrag;
	}

	public void setBruttoBeitrag(int bruttoBeitrag) {
		this.bruttoBeitrag = bruttoBeitrag;
	}

	public int getNettoBeitrag() {
		return nettoBeitrag;
	}

	public void setNettoBeitrag(int nettoBeitrag) {
		this.nettoBeitrag = nettoBeitrag;
	}

	public int getVnr() {
		return vnr;
	}

	public void setVnr(int vnr) {
		this.vnr = vnr;
	}

	public String getBemerkung() {
		return bemerkung;
	}

	public void setBemerkung(String bemerkung) {
		this.bemerkung = bemerkung;
	}

	@Override
	public String toString() {
		return "SimplePojo [bruttoBeitrag=" + bruttoBeitrag + ", nettoBeitrag="
				+ nettoBeitrag + ", vnr=" + vnr + ", bemerkung=" + bemerkung
				+ "]";
	}

}
