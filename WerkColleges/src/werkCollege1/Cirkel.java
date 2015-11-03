package werkCollege1;
import java.lang.Math; 

/**
 * 
 * @author christophe.swolfs
 */

//color enum
enum Kleur{WIT,ROOD,GEEL,BLAUW,ZWART};

//Circle
public class Cirkel {
	public static final Kleur defaultKleur = Kleur.WIT;
	public static final double defaultStraal= 0.0;
	
	//Datamembers
	private Kleur kleur;
	private double straal;
	
	
	//getters setters
	/**
	 * color getter
	 * @return color
	 */
	public Kleur getKleur() {
		return kleur;
	}
	/**
	 * 
	 * color setter
	 * @param kleur the color to set (enum)
	 */
	public void setKleur(Kleur kleur) {
		this.kleur = kleur;
	}
	/**
	 * 
	 * @return radius
	 */
	public double getStraal() {
		return straal;
	}
	/**
	 * radius setter
	 * @param straal the radius to set
	 */
	public void setStraal(double straal) {
		this.straal = straal;
	}
	
	
	//Constructors
	public Cirkel(){
		straal = defaultStraal;
		this.kleur = defaultKleur;
	}
	public Cirkel(Cirkel c){
		straal = c.straal;
		this.kleur = c.kleur;
	}
	public Cirkel(double straal){
		this.straal = straal;
		this.kleur = defaultKleur;
	}
	public Cirkel(Kleur kleur){
		straal = defaultStraal;
		this.kleur = kleur;
	}
	public Cirkel(double straal,Kleur kleur){
		this.straal = straal;
		this.kleur = kleur;
	}
	
	//Methods
	
	/**
	 * 
	 * @return  the different datamembers in a string.
	 */
	@Override
	public String toString(){
		String tempString;
		tempString = "Crikel: " +  "straal = " + straal + " kleur= " + kleur;
		return tempString;
	}
	
	/**
	 * 
	 * @return  the circumference
	 */
	public double geefOmtrek(){
		return 2 * straal * Math.PI;
	}

	/**
	 * 
	 * @return  the surface
	 */
	public double geefOppervlakte(){
		return straal * straal * Math.PI;
	}
	

}
