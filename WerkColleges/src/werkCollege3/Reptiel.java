package werkCollege3;

import java.sql.Date;

public class Reptiel extends GewerveldDier {

	//Constructor
	public Reptiel(String naam,Date geboortedatum) {
		super(naam, geboortedatum);
		m_huidType = HuidType.ANDER;
		// TODO Auto-generated constructor stub
	}

	//to string
	@Override
	public String toString() {
		return "Ik ben een: " + getClass() + " - "+ getNaam();
	}

	
	
	//other methods
	@Override
	public String MaakGeluid() {
		return "Reptiel Geluid";
	}

	
}
