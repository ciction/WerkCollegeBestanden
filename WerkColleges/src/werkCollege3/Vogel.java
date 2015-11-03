package werkCollege3;

import java.sql.Date;

public class Vogel extends GewerveldDier implements I_KanVliegen{

	//Constructor
	public Vogel(String naam, Date geboortedatum) {
		super(naam, geboortedatum);
		m_huidType = HuidType.PLUIMEN;
	}

	@Override
	public String toString() {
		return "Ik ben een: " + getClass() + " - "+ getNaam();
	}

	//other methods
	@Override
	public String MaakGeluid() {
		return "Vogel Geluid";
	}
	
	
	@Override
	public void vlieg() {
		System.out.println("ik vlieg");
		
	}
}
