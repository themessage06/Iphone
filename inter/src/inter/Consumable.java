package inter;

public interface Consumable {

	void consume();//by default, abstract

	default void buy() {
		System.out.println("You are buying me");
	}

}