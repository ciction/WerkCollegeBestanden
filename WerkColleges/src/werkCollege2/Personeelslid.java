package werkCollege2;

public class Personeelslid extends Persoon {

	private Kantoor m_kantoor;
	
	public Personeelslid(String m_voornaam, String m_achternaam, Kantoor kantoor) {
		super(m_voornaam, m_achternaam);
		m_kantoor = kantoor;
		// TODO Auto-generated constructor stub
	}

	//Getters and setters
	public Kantoor getM_kantoor() {
		return m_kantoor;
	}

	public void setM_kantoor(Kantoor m_kantoor) {
		this.m_kantoor = m_kantoor;
	}

	@Override
	public String toString() {
		return (super.toString() +  "Personeelslid [m_kantoor=" + m_kantoor.toString() + "]" + "\n");
	}
	
	
	
	

}
