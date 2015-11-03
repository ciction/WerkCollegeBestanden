package Observer;

public class StatisticsDisplay implements Observer {

	private WeatherData data;
	private String waarden;
	
	
	
	public StatisticsDisplay(WeatherData data) {
		super();
		this.data = data;
		this.waarden = "";
	}



	@Override
	public void update() {
		// TODO Auto-generated method stub
		waarden += data.getTemp();
		System.out.println("waarden: " + waarden );
	}

}
