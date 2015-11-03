package werkCollege1;

import java.sql.Date;

import javax.swing.JFrame;

import werkCollege2.*;
import werkCollege3.*;
import werkCollege4.Som;
import werkCollege5.oef1LabelsFrame;



public class Main {
	
	public static void Werkcollege1(){
		Cirkel c = new Cirkel();
		
		System.out.println(c.toString());
		System.out.println("Omtrek = " + c.geefOmtrek());
		System.out.println("Oppervlakte = " + c.geefOppervlakte());
		
		
		System.out.println();
		System.out.println("adress:");
		
		Adres a = new Adres();
		System.out.println(a.toString());
		
		Cirkel binnencirkelZwembad1 = new Cirkel(6);
		Cirkel buitencirkelZwembad1 = new Cirkel(8);
		
		System.out.println();
		System.out.println("Zwembad:");
		Zwembad zwembad1 = new Zwembad(binnencirkelZwembad1, buitencirkelZwembad1, 20, 6);
		
		System.out.println("prijs pad = " + zwembad1.BerekenkostenPad());
	}
	public static void Werkcollege2(){
		System.out.println();
		System.out.println("Persoon:");
		System.out.println();
				
		Persoon persoon1 = new Persoon("Christophe", "Swolfs");
		Persoon persoon2 = new Persoon("Christophe", "Swolfs");
		Persoon persoon3 = new Persoon("Kristof", "Cappellen");
		
		System.out.println(persoon1.toString());
		System.out.println(persoon2.toString());
		System.out.println(persoon3.toString());
		
		System.out.println();
		System.out.println("persoon1.equals(persoon2): " + persoon1.equals(persoon2));
		System.out.println("persoon1.equals(persoon1): " + persoon1.equals(persoon1));
		System.out.println("persoon1.equals(persoon3): " + persoon1.equals(persoon3));
		Student studentPersoon1 = new Student("Christophe", "Swolfs", 001, "DigX");
		
		
		System.out.println("Aantal personen = " + Persoon.getM_sObjectCount());
		
		System.out.println();
		System.out.println("hierarchie:");
		
		Adres adresCampusKaai = new Adres();
		Kantoor kantoor1 = new Kantoor(adresCampusKaai, "001", 0);
		Kantoor kantoor2 = new Kantoor(adresCampusKaai, "102", 1);
		Kantoor kantoor3 = new Kantoor(adresCampusKaai, "202", 2);
		Administrator adminMeskens = new Administrator("Jan", "Meskens", kantoor1, "DigX");
		Administrator adminWante = new Administrator("Jan", "Wante", kantoor2, "DigX");
		Docent docentWemaels = new Docent("Steve", "Wemaels", kantoor2, "ERP");
		
		System.out.println(docentWemaels.toString());
		adminMeskens.VeranderKantoor(docentWemaels,kantoor3);
		System.out.println(docentWemaels.toString());
		
		System.out.println();
		AdministratieTool administratie = new AdministratieTool();
		administratie.addPersoon(adminMeskens);
		administratie.addPersoon(adminWante);
		administratie.addPersoon(docentWemaels);
		administratie.addPersoon(studentPersoon1);
		
		System.out.println(administratie.getPersonen());
		System.out.println(administratie.getPersoonCount());

	}
	public static void Werkcollege3(){
		Date date1 = Date.valueOf("1991-5-22");
		Dier boorspons = new sponsOngewerveldDier("boorspons",date1);
		Dier dolfijn = new ZoogDier("dolfijn",date1,1);
		Dier kat = new ZoogDier("kat",date1,0.05);
		Dier kikker = new Amfibie("kikker",date1,0.05);
		Dier kwal = new holteOngewerveldDier ("holteOngewerveldDier",date1);
		Dier slang = new Reptiel("slang",date1);
		Dier zalm = new Vis("zalm",date1);
		Dier vleermuis = new VliegendZoogdier("vleermuis",date1,0.05);
		Dier gans = new Vogel("gans",date1);
		
		if(vleermuis.getClass() == VliegendZoogdier.class){
			((VliegendZoogdier)vleermuis).vlieg();
			
			System.out.println(boorspons.getId());
			System.out.println(vleermuis.getId());
		}
		

		

	}
	public static void Werkcollege4(){
		Date date1 = Date.valueOf("1991-5-22");
		Dier dolfijn = new ZoogDier("dolfijn",date1,1);
		Dier kat = new ZoogDier("kat",date1,0.05);
		
		System.out.println(dolfijn.compareTo(kat));
		System.out.println((char)('A' + 32));
		
		System.out.println(dolfijn.getM_geboortedatum());
		
		
		Som s = new Som(Double.MAX_VALUE, 1);
			
			
		System.out.println(s.getResult());

		
		
		
	};
	
	public static void Werkcollege5(){
		oef1LabelsFrame frame = (oef1LabelsFrame) new JFrame("FrameDemo");
	}
	
	public static void main(String args[]){
		Werkcollege5();
	}
	
	
	
}



















