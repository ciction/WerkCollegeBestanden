package werkCollege1;

public class BankRekening {
	
	//datamembers
	private double bedrag;

	//constructors
	public BankRekening() {
		super();
		this.bedrag = 0.0;
	}
	
	public BankRekening(double bedrag) {
		super();
		if (bedrag < 0) bedrag = 0;
		this.bedrag = bedrag;
	}

	//getters and setters
	public double getBedrag() {
		return bedrag;
	}

	private void setBedrag(double bedrag) {
		this.bedrag = bedrag;
	}
	
	//methods
	public void StortBedrag(double bedrag) {
		this.bedrag += bedrag;
	}
	
	public void HaalAfBedrag(double bedrag) {
		if(this.bedrag - bedrag < -1000)
		{
			System.out.println("het bedrag is te groot, ja mag niet onder -1000 gaan");
		}
		else
			this.bedrag -= bedrag;
	}
	
	@Override
	public String toString() {
		return "het huidige saldo bedraagt: " + bedrag;
	}
	
	
	 
	
}
