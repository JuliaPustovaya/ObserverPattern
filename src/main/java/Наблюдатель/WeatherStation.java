package Наблюдатель;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData= new WeatherData()  ;
		CurrentConditionsDisplay currentConditionsDisplay= new CurrentConditionsDisplay(weatherData);

		weatherData.setMeasurements(80,65,30);
		weatherData.setMeasurements(14,25,41);
	}
}
