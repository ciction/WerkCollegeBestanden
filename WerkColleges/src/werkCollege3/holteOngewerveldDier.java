package werkCollege3;

import java.sql.Date;

public class holteOngewerveldDier extends OngewerveldDier {

	private double m_holteDiameter;
	
	//Constructor
	public holteOngewerveldDier(String naam, Date geboortedatum) {
		super(naam, geboortedatum);
		// TODO Auto-generated constructor stub
	}
	
	
	//getters setters
	public double getM_holteDiameter() {
		return m_holteDiameter;
	}

	public void setM_holteDiameter(double m_holteDiameter) {
		this.m_holteDiameter = m_holteDiameter;
	}


	//tostring
	@Override
	public String toString() {
		return "Ik ben een: " + getClass() + " - "+ getNaam();
	}


	@Override
	public String MaakGeluid() {
		return "holteOngewerveldDier Geluid";
		
	}

	
}
