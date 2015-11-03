package werkCollege2;

import java.util.ArrayList;

/**
 * @author christophe.swolfs
 *
 */
public class Docent extends Personeelslid{
	private String m_specialisatie;
	private ArrayList<Student> m_teaches = new ArrayList<Student>();
	
	
	//Constructor
	public Docent(String m_voornaam, String m_achternaam, Kantoor kantoor, String specialisatie) {
		super(m_voornaam, m_achternaam, kantoor);
		m_specialisatie = specialisatie;
	}
	
	public Docent(String m_voornaam, String m_achternaam, Kantoor kantoor, String specialisatie,ArrayList<Student> students ) {
		super(m_voornaam, m_achternaam, kantoor);
		m_specialisatie = specialisatie;
		m_teaches = students;
	}

	


	//Getters / Setters
	public String getM_specialisatie() { 
		return m_specialisatie;
	}


	public void setM_specialisatie(String m_specialisatie) {
		this.m_specialisatie = m_specialisatie;
	}


	public ArrayList<Student> getM_teaches() {
		return m_teaches;
	}


	public void setM_teaches(ArrayList<Student> m_teaches) {
		this.m_teaches = m_teaches;
	}

	@Override
	public String toString() {
		return (super.toString() +  "Docent [m_specialisatie=" + m_specialisatie + ", m_teaches=" + m_teaches + "]" + "\n");
	}
	

	
	
}
