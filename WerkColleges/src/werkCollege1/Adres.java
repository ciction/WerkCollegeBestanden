package werkCollege1;

import java.util.Arrays;

public class Adres {

	//Datamembers
	private String straatnaam;
	private int huisnummer;
	private int bus;
	private int[] postcode = {0,0,0,0};
	private String woonplaats;
	
	
	
	//Getters and setters
	public String getStraatnaam() {
		return straatnaam;
	}


	public void setStraatnaam(String straatnaam) {
		this.straatnaam = straatnaam;
	}


	public int getHuisnummer() {
		return huisnummer;
	}


	public void setHuisnummer(int huisnummer) {
		this.huisnummer = huisnummer;
	}


	public int getBus() {
		return bus;
	}


	public void setBus(int bus) {
		this.bus = bus;
	}


	public int[] getPostcode() {
		return postcode;
	}


	public void setPostcode(int[] postcode) {
		this.postcode = postcode;
	}


	public String getWoonplaats() {
		return woonplaats;
	}


	public void setWoonplaats(String woonplaats) {
		this.woonplaats = woonplaats;
	}


	//Cosntructors
	public Adres() {
		super();
		this.straatnaam = "empty";
		this.huisnummer = 0;
		this.bus = 0;
		this.postcode = new int[] {0,0,0,0};
		this.woonplaats = "empty";
	}
	
	public Adres(Adres adres) {
		this.straatnaam = adres.straatnaam; 
		this.huisnummer = adres.huisnummer;
		this.bus = adres.bus;
		this.postcode = adres.postcode;
		this.woonplaats = adres.woonplaats;
	}


	//Tostring
	public Adres(String straatnaam, int huisnummer, int bus, int[] postcode, String woonplaats) {
		super();
		this.straatnaam = straatnaam;
		this.huisnummer = huisnummer;
		this.bus = bus;
		this.postcode = postcode;
		this.woonplaats = woonplaats;
	}




	@Override
	public String toString() {
		return "Adres [straatnaam=" + straatnaam + ", huisnummer=" + huisnummer + ", bus=" + bus + ", postcode="
				+ Arrays.toString(postcode) + ", woonplaats=" + woonplaats + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bus;
		result = prime * result + huisnummer;
		result = prime * result + Arrays.hashCode(postcode);
		result = prime * result + ((straatnaam == null) ? 0 : straatnaam.hashCode());
		result = prime * result + ((woonplaats == null) ? 0 : woonplaats.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adres other = (Adres) obj;
		if (bus != other.bus)
			return false;
		if (huisnummer != other.huisnummer)
			return false;
		if (!Arrays.equals(postcode, other.postcode))
			return false;
		if (straatnaam == null) {
			if (other.straatnaam != null)
				return false;
		} else if (!straatnaam.equals(other.straatnaam))
			return false;
		if (woonplaats == null) {
			if (other.woonplaats != null)
				return false;
		} else if (!woonplaats.equals(other.woonplaats))
			return false;
		return true;
	}
	
	
	
	

}
