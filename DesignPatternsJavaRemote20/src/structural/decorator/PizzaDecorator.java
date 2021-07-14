package structural.decorator;

public class PizzaDecorator implements Pizza {

    protected Pizza pizza;


    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        pizza.addIngredient(ingredient);
    }

    @Override
    public int getCost() {
        return pizza.getCost();
    }

    @Override
    public void showIngredients() {
        pizza.showIngredients();
    }
}
