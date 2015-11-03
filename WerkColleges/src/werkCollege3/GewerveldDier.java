package werkCollege3;

import java.sql.Date;

public abstract class GewerveldDier extends Dier {

	protected enum HuidType{
		BERHAARD, SCHUBBEN, PLUIMEN, ANDER
	}
	
	protected int m_lengte;
	protected HuidType m_huidType;
	
			
	public GewerveldDier(String naam,Date geboortedatum) {
		super(naam, geboortedatum);
		// TODO Auto-generated constructor stub
	}
	
	

	//getters setters
	public int getM_lengte() {
		return m_lengte;
	}
	public void setM_lengte(int m_lengte) {
		this.m_lengte = m_lengte;
	}

	public HuidType getM_huidType() {
		return m_huidType;
	}
	public void setM_huidType(HuidType m_huidType) {
		this.m_huidType = m_huidType;
	}



	//tostring
	@Override
	public String toString() {
		return "Ik ben een: " + getClass() + " - "+ getNaam();	}

	
	


	



	//Ohter methods
	@Override
	abstract public String MaakGeluid();


}
