package werkCollege3;

import java.sql.Date;

public class VliegendZoogdier extends ZoogDier implements I_KanVliegen {

	public VliegendZoogdier(String naam, Date geboortedatum, double tijdOnderWater) {
		super(naam, geboortedatum, tijdOnderWater);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void vlieg() {
		System.out.println("ik vlieg");
		
	}

	
}
