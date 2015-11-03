package werkCollege3;

import java.sql.Date;

public class Amfibie extends GewerveldDier implements I_KanEenTijdOnderWater{

	private double m_tijdOnderWater;
	
	//Constructor
	public Amfibie(String naam,Date geboortedatum, double tijdOnderWater) {
		super(naam, geboortedatum);
		m_huidType = HuidType.ANDER;
		m_tijdOnderWater = tijdOnderWater;
		// TODO Auto-generated constructor stub
	}

	//toString
	@Override
	public String toString() {
		return "Ik ben een: " + getClass() + " - "+ getNaam();
	}

	//methods
	@Override
	public String MaakGeluid() {
		return "Amfibie Geluid";
		
	}


	public double geefTijdOnderWater()
	{
		return m_tijdOnderWater;
	}
	
	
}
