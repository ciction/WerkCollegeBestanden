package Singleton;

public class Singleton {
	private static Singleton uniqueInstance;
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		if(uniqueInstance == null)
			return uniqueInstance = new Singleton();
		else
			return uniqueInstance;
		
	}

}
