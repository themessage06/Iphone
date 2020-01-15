package inter;

public class Tester {

	public static void main(String[] args) {
		
		Food food = new Kabab();
		food.buy();
		food.cook();
		food.consume ();
		
		Kabab kabab =new Kabab();
		kabab.cook();
		kabab.buy();
		kabab.consume ();
		
		Consumable consumable= new Movie();
		consumable.buy();
		consumable.consume ();

	}

}
