package Декоратор;

public class StarBuzzMain {
	public static void main(String[] args) {
		Beverage espresso= new Espresso();
		System.out.println(espresso.getDescription());
		System.out.println(espresso.coast());

//		Beverage doma= new HouseHold();
//		Beverage soy= new Soy(doma);
//		Beverage ch= new Mocha(soy);
//		Beverage w = new Whip(ch)  ;
//		System.out.println(w.getDescription());

		Beverage res= new Whip(new Mocha(new Soy(new HouseHold())));
		System.out.println(res.getDescription());
		System.out.println(res.coast());
	}
}
