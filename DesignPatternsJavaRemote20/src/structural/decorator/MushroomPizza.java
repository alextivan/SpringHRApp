package structural.decorator;

public class MushroomPizza extends PizzaDecorator{




    public MushroomPizza(Pizza pizza) {
        super(pizza);
        addIngredient(new Ingredient("Mushroom", 3));
    }

    @Override
    public int getCost() {
        return super.getCost() + 3;
    }


}
