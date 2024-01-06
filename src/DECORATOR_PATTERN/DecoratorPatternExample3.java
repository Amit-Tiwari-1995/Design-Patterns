package DECORATOR_PATTERN;

abstract class BasePizza {
	public abstract int cost();
}

class FarmHousePizza extends BasePizza {

	public int cost() {

		return 350;

	}

}

class MargheritaPizza extends BasePizza {

	public int cost() {

		return 250;

	}

}

class VegPizza extends BasePizza {

	public int cost() {

		return 150;

	}

}

abstract class PizzaToppingDecorator extends BasePizza {

}

class ExtraChees extends PizzaToppingDecorator {

	BasePizza basePizza;

	public ExtraChees(BasePizza basePizza) {
		this.basePizza = basePizza;
	}

	public int cost() {
		return this.basePizza.cost() + 30;

	}

}

class ExtraMushroom extends PizzaToppingDecorator {

	BasePizza basePizza;

	public ExtraMushroom(BasePizza basePizza) {
		this.basePizza = basePizza;
	}

	public int cost() {
		return this.basePizza.cost() + 50;

	}

}

public class DecoratorPatternExample3 {

	public static void main(String[] args) {
		
		BasePizza pizza = new ExtraChees(new FarmHousePizza());
		System.out.println(pizza.cost());

	}

}
