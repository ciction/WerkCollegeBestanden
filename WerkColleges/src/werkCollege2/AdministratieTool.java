package werkCollege2;

import java.util.ArrayList;

public class AdministratieTool {
	private ArrayList<Persoon> m_personen  = new ArrayList<Persoon>();
	
	public void addPersoon(Persoon persoon){
		m_personen.add(persoon);
	}
	
	public String getPersonen(){
		String output = "";
		
		for(Persoon p : m_personen)
		{
			output += (p.getNaam() +  " " + p.getClass().getSimpleName() +  "\n");
		}
		
		return output;
	}
	
	public String getPersoonCount(){
		return  "personen: " + Persoon.getM_sObjectCount() + " waarvan: " + m_personen.size() + " in het systeem.";		
	}
	
}
