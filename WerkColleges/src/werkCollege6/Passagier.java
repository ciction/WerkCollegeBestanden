package werkCollege6;

import java.util.Date;

public class Passagier {
	private String naam;
	private Date opstartDatumDossier;
	
	//Constructor
	//-------------------------
	public Passagier(String naam, Date opstartDatumDossier) {
		super();
		this.naam = naam;
		this.opstartDatumDossier = opstartDatumDossier;
	}

	
	//Getters / Setters
	//-------------------------
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Date getOpstartDatumDossier() {
		return opstartDatumDossier;
	}

	public void setOpstartDatumDossier(Date opstartDatumDossier) {
		this.opstartDatumDossier = opstartDatumDossier;
	}
	
	
	
	

}
