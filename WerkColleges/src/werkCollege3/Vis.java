package werkCollege3;

import java.sql.Date;

public class Vis extends GewerveldDier {

	private int m_aantalVinnen;
	
	//Constructor
	public Vis(String naam,Date geboortedatum) {
		super(naam, geboortedatum);
		m_huidType = HuidType.SCHUBBEN;
	}
	
	//getter setters
	public int getM_aantalVinnen() {
		return m_aantalVinnen;
	}

	public void setM_aantalVinnen(int m_aantalVinnen) {
		this.m_aantalVinnen = m_aantalVinnen;
	}

	//tostring
	@Override
	public String toString() {
		return "Ik ben een: " + getClass() + " - "+ getNaam();
	}
	
	//other methods
	@Override
	public String MaakGeluid() {
		return "Vis Geluid";
	}

	

	
}
