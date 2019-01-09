package Наблюдатель;

import java.util.Observable;

public class WeatherData extends Observable {
	float humudity;
	float pressure;
	float temperature;

	public float getHumudity() {
		return humudity;
	}

	public float getPressure() {
		return pressure;
	}

	public float getTemperature() {
		return temperature;
	}

	WeatherData() {
	}

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humudity, float pressure) {
		this.temperature = temperature;
		this.humudity = humudity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
