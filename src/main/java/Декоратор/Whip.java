package Декоратор;

public class Whip extends CondimentDecorator{
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription()+ ",  Whipp";
	}

	public double coast() {
        		return beverage.coast()+0.30;
	}
}
