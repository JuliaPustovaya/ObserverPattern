package Декоратор;

public class Mocha  extends CondimentDecorator{
	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription()+ ", Mocha";
	}

	public double coast() {
        		return beverage.coast()+0.20;
	}
}
