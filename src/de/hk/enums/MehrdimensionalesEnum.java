package de.hk.enums;

import de.hk.exception.BeispielException;


/**
 * Beispiel fuer ein mehrdimensionales Enum
 */
public enum MehrdimensionalesEnum {

	LEBENSVERSICHERUNG("Lebens- oder Rentenversicherung mit Todesfallrisiko",1),
	BUVERSICHERUNG("Berufsunfaehigkeits Versicherung",2),
	PFLEGEVERSICHERUNG("Pflegerentenversicherung",3);
	 
	private MehrdimensionalesEnum(String name, long schluessel) {
		this.schluessel = schluessel;
		this.name = name;
	}

	private String name;
	private long schluessel;
	
	public long getSchluessel() {
		return schluessel;
	}
	
	public String getName() {
		return name;
	}
	
	public static MehrdimensionalesEnum createWagnisart(long wagnisart) throws BeispielException 
	{
		for (MehrdimensionalesEnum grundEnum: MehrdimensionalesEnum.values()) {
			if (wagnisart == grundEnum.getSchluessel()) return grundEnum;
		}
		throw new BeispielException("Unbekannte MehrdimensionalesEnum: " + wagnisart);
	}
}
