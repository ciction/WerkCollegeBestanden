package werkCollege3;
import java.sql.Date;

public abstract class Dier implements java.lang.Comparable<Dier>{

	
	
	private Date m_geboortedatum;
	private String m_naam;
	private final int m_ID;
	private static int s_ID = 0;
	
	public Dier(String naam, Date geboortedatum )
	{
		m_naam = naam;
		++ s_ID;
		m_ID = s_ID;
		m_geboortedatum = geboortedatum;
	}
	abstract public String toString();
	abstract public String MaakGeluid();
	
	public String getNaam(){
		return m_naam;
	}
	
	public int getId(){
		return m_ID;
	}
	
	

	 public Date getM_geboortedatum() {
		return m_geboortedatum;
	}
	public void setM_geboortedatum(Date m_geboortedatum) {
		this.m_geboortedatum = m_geboortedatum;
	}
	@Override
	    public int compareTo(Dier other){
	        // compareTo should return < 0 if this is supposed to be
	        // less than other, > 0 if this is supposed to be greater than 
	        // other and 0 if they are supposed to be equal
	        int last = this.m_naam.compareTo(other.m_naam);
	        return last;
	    }

	

}
