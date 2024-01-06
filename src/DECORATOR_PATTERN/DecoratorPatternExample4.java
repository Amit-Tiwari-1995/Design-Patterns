package DECORATOR_PATTERN;

interface Pizza {
	public void bake();
}

class BasicPizza implements Pizza {
	public void bake() {
		System.out.println("Bake basic pizza");
	}

}

class DecoratorPizza implements Pizza {
	Pizza pizza;

	public DecoratorPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	public void bake() {
		this.pizza.bake();

	}

}

class VeggiePizza extends DecoratorPizza {
	Pizza pizza;

	public VeggiePizza(Pizza pizza) {
		super(pizza);
	}

	public void bake() {
		super.bake();
		System.out.println("Bake Veggie Pizza");

	}

}

class CheesePizza extends DecoratorPizza {
	Pizza pizza;

	public CheesePizza(Pizza pizza) {
		super(pizza);
	}

	public void bake() {
		super.bake();
		System.out.println("Bake Cheese Pizza");

	}

}

public class DecoratorPatternExample4 {

	public static void main(String[] args) {

		Pizza pizza = new VeggiePizza(new CheesePizza(new BasicPizza()));
		pizza.bake();

	}

}
