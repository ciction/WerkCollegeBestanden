package Observer;


public class CurrentWeatherDisplay implements Observer {

	private WeatherData data;
	
	
	public CurrentWeatherDisplay(WeatherData data) {
		super();
		this.data = data;
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("huidige temp is:" + data.getTemp());

		
	}


}
