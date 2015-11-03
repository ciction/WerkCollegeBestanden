package werkCollege3;

import java.sql.Date;

public class sponsOngewerveldDier extends OngewerveldDier {

	//Constructor
	public sponsOngewerveldDier(String naam,Date geboortedatum) {
		super(naam, geboortedatum);
	}

	
	@Override
	public String toString() {
		return "Ik ben een: " + getClass() + " - "+ getNaam();
	}

	//other methods
		@Override
		public String MaakGeluid() {
			return "sponsOngewerveldDier Geluid";
		}

}
