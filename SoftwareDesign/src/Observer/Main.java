package Observer;

public class Main {

	public static void main(String args[]){
		
		WeatherData data = new WeatherData();
		CurrentWeatherDisplay cw = new CurrentWeatherDisplay(data);
		StatisticsDisplay sw = new StatisticsDisplay(data);
		data.addObserver(cw);
		data.addObserver(sw);
		
		data.setTemp(25);
		data.notifyObservers();
		
		data.setTemp(17);
		data.notifyObservers();
	}
}
