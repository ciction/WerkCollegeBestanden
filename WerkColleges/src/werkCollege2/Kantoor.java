package werkCollege2;

import werkCollege1.Adres;

public class Kantoor {
	private Adres m_adres;
	private String m_gebouw;
	private int m_verdieping;
	
	
	
	//Constructor
	public Kantoor(Adres m_adres, String m_gebouw, int m_verdieping) {
		super();
		this.m_adres = m_adres;
		this.m_gebouw = m_gebouw;
		this.m_verdieping = m_verdieping;
	}
	
	
	//getters setters
	public Adres getM_adres() {
		return m_adres;
	}
	public void setM_adres(Adres m_adres) {
		this.m_adres = m_adres;
	}
	public String getM_gebouw() {
		return m_gebouw;
	}
	public void setM_gebouw(String m_gebouw) {
		this.m_gebouw = m_gebouw;
	}
	public int getM_verdieping() {
		return m_verdieping;
	}
	public void setM_verdieping(int m_verdieping) {
		this.m_verdieping = m_verdieping;
	}
	
	
	//equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((m_adres == null) ? 0 : m_adres.hashCode());
		result = prime * result + ((m_gebouw == null) ? 0 : m_gebouw.hashCode());
		result = prime * result + m_verdieping;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kantoor other = (Kantoor) obj;
		if (m_adres == null) {
			if (other.m_adres != null)
				return false;
		} else if (!m_adres.equals(other.m_adres))
			return false;
		if (m_gebouw == null) {
			if (other.m_gebouw != null)
				return false;
		} else if (!m_gebouw.equals(other.m_gebouw))
			return false;
		if (m_verdieping != other.m_verdieping)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Kantoor [m_adres=" + m_adres.toString() + ", m_gebouw=" + m_gebouw + ", m_verdieping=" + m_verdieping + "]";
	}
	
	
	
	
	
}
