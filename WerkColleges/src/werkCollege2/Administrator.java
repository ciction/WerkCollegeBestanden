package werkCollege2;

public class Administrator extends Personeelslid{
	private String m_departement;
	
	//Constructor
	public Administrator(String m_voornaam, String m_achternaam, Kantoor kantoor, String departement) {
		super(m_voornaam, m_achternaam, kantoor);
		m_departement = departement;

	}
	
	public void VeranderKantoor(Personeelslid personeelslid,Kantoor nieuwKantoor)
	{
		personeelslid.setM_kantoor(nieuwKantoor);
	}
	
	
	
}
