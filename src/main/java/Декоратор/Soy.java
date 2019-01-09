package Декоратор;

public class Soy extends CondimentDecorator{
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription()+ ", Soy";
	}

	public double coast() {
        		return beverage.coast()+0.20;
	}
}
