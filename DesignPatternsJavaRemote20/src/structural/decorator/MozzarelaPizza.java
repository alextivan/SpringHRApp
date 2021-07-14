package structural.decorator;

public class MozzarelaPizza extends PizzaDecorator{

    public MozzarelaPizza(Pizza pizza) {
        super(pizza);
        addIngredient(new Ingredient("Cheese", 2));

    }

    @Override
    public int getCost() {
        return super.getCost() + 2;
    }
}
