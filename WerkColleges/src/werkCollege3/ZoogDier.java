package werkCollege3;

import java.sql.Date;

public class ZoogDier extends GewerveldDier implements I_KanEenTijdOnderWater {

	private double m_tijdOnderWater;
	private int m_periodeVanZwangerschap;
	
	//Constructor
	public ZoogDier(String naam, Date geboortedatum, double tijdOnderWater) {
		super(naam, geboortedatum);
		m_huidType = HuidType.BERHAARD;
		m_tijdOnderWater = tijdOnderWater;
	}
	
	//getters setters
	public int getM_periodeVanZwangerschap() {
		return m_periodeVanZwangerschap;
	}

	public void setM_periodeVanZwangerschap(int m_periodeVanZwangerschap) {
		this.m_periodeVanZwangerschap = m_periodeVanZwangerschap;
	}

	//tostring
	@Override
	public String toString() {
		return "Ik ben een: " + getClass() + " - "+ getNaam();
	}
	
	//other methods
	@Override
	public String MaakGeluid() {
		return "ZoogDier Geluid";
	}

	@Override
	public double geefTijdOnderWater() {
		return m_tijdOnderWater;
	}

	

	
	
	
}
