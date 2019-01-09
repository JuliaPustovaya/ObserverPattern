package Наблюдатель;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
	Observable observable;
	private float hum;
	private float temp;

	CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	public void display() {
		System.out.println("Current conditions " + " temp" + temp + " ...");
	}

	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData=(WeatherData)o;
			this.temp = weatherData.getTemperature();
			this.hum=weatherData.getHumudity();
			display();
		}
	}

}
