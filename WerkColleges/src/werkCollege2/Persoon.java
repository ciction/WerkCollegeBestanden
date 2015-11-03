package werkCollege2;

import werkCollege1.Adres;

public class Persoon {
	//static
	private static int m_sObjectCount = 0;
	
	//members
	private String m_voornaam;
	private String m_achternaam;
	private int m_telefoon;
	private Adres m_adres;
	
	
	//constructors
	
	public Persoon(String m_voornaam, String m_achternaam) {
		super();
		this.m_voornaam = m_voornaam;
		this.m_achternaam = m_achternaam;
		this.m_telefoon = 0;
		this.m_adres = new Adres();
		++ m_sObjectCount;
	}
	
	public Persoon(String m_voornaam, String m_achternaam, int m_telefoon, Adres m_adres) {
		super();
		this.m_voornaam = m_voornaam;
		this.m_achternaam = m_achternaam;
		this.m_telefoon = m_telefoon;
		this.m_adres = m_adres;
		++ m_sObjectCount;
	}
	
	
	//getters setters
	public static int getM_sObjectCount() {
		return m_sObjectCount;
	}
	
	//functions
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Persoon: " +  m_voornaam + " " + m_achternaam + ", Telefoon: " 
				+ m_telefoon + ", Adres: "+ m_adres.toString() + "\n";
	}


	public String getNaam(){
		return m_voornaam + " " + m_achternaam;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;		
		result = prime * result + ((m_achternaam == null) ? 0 : m_achternaam.hashCode());
		result = prime * result + ((m_adres == null) ? 0 : m_adres.hashCode());
		result = prime * result + m_telefoon;
		result = prime * result + ((m_voornaam == null) ? 0 : m_voornaam.hashCode());
		return result;
	}

	
	/**
	 * two people are equal if their first name and second name are equal
	 * @see java.lang.Object#equals(java.lang.Object)
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persoon other = (Persoon) obj;
		if (m_achternaam == null) {
			if (other.m_achternaam != null)
				return false;
		}else if (!m_achternaam.equals(other.m_achternaam))
			return false;
		if(m_voornaam == null){
			if(other.m_voornaam != null)
				return false;
		}else if(!m_voornaam.equals(other.m_voornaam))
			return false;
		
		return true;
		}
		

	
	
	
	
	
}
