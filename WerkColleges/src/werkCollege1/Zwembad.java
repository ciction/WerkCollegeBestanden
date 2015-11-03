package werkCollege1;
//import java.lang.Math; zit er standaard in.

public class Zwembad {
	
	private Cirkel BinnenCirkel;
	private Cirkel BuitenCirkel;
	private double prijsPerVierkanteMeterPad;
	private double prijsPerMeterOmheining;
	
	private double OppervlaktePad = 0.0;
	
	
	public Zwembad(Cirkel straalBinnenCirkel,
			Cirkel straalBuitenCirkel, 
				   double prijsPerVierkanteMeterPad,
				   double prijsPerMeterOmheining) {
		super();
		this.BinnenCirkel = straalBinnenCirkel;
		this.BuitenCirkel = straalBuitenCirkel;
		this.prijsPerVierkanteMeterPad = prijsPerVierkanteMeterPad;
		this.prijsPerMeterOmheining = prijsPerMeterOmheining;
		
		BerekenOppervlaktePad();
	}
	
	
	public void  BerekenOppervlaktePad(){
		OppervlaktePad = BuitenCirkel.geefOppervlakte() - BinnenCirkel.geefOppervlakte();
	}
	
	public double BerekenkostenPad(){
		return OppervlaktePad * prijsPerVierkanteMeterPad;
	}
	
	public double BerekenkostenOmheining(){
		return BuitenCirkel.geefOmtrek() * prijsPerMeterOmheining;
	}
	
	public double BerekenTotaleKost(){
		return BerekenkostenPad() + BerekenkostenOmheining(); 
	}
	
	
	
	
	

}
