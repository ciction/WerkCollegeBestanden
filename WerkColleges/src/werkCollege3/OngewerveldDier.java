package werkCollege3;

import java.sql.Date;

public abstract class OngewerveldDier extends Dier {

	private String m_kleur;
	
	//Constructor
	public OngewerveldDier(String naam,Date geboortedatum) {
		super(naam, geboortedatum);
	}

	
	//getter setter
	public String getM_kleur() {
		return m_kleur;
	}

	public void setM_kleur(String m_kleur) {
		this.m_kleur = m_kleur;
	}
	
	//tostring 
	@Override
	public String toString() {
		return "Ik ben een: " + getClass() + " - "+ getNaam();
	}

	

	//Ohter methods
	@Override
	abstract public String MaakGeluid();

	
}
