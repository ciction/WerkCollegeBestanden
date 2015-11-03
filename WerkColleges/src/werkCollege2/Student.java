package werkCollege2;

public class Student extends Persoon {
	private int studentenNummer;
	private String Specialisatie;
	
	
	//Consturctor
	public Student(String voornaam, String achternaam, int studentenNummer, String specialisatie) {
		super(voornaam, achternaam);
		this.studentenNummer = studentenNummer;
		Specialisatie = specialisatie;
	}


	//getters setters
	public int getStudentenNummer() {
		return studentenNummer;
	}


	public void setStudentenNummer(int studentenNummer) {
		this.studentenNummer = studentenNummer;
	}


	public String getSpecialisatie() {
		return Specialisatie;
	}


	public void setSpecialisatie(String specialisatie) {
		Specialisatie = specialisatie;
	}


	//equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Specialisatie == null) ? 0 : Specialisatie.hashCode());
		result = prime * result + studentenNummer;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Specialisatie == null) {
			if (other.Specialisatie != null)
				return false;
		} else if (!Specialisatie.equals(other.Specialisatie))
			return false;
		if (studentenNummer != other.studentenNummer)
			return false;
		return true;
	}
	
	
	
	

}
