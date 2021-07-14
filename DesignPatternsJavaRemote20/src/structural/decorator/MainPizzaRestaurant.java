package structural.decorator;

public class MainPizzaRestaurant {

    public static void main(String[] args) {

        MozzarelaPizza mozzarelaPizza = new MozzarelaPizza(new BasePizza());
        mozzarelaPizza.showIngredients();
        System.out.println(mozzarelaPizza.getCost());

        Pizza customPizza = new BasePizza();
        Ingredient corn = new Ingredient("Corn", 2);
        customPizza.addIngredient(corn);
        customPizza.addIngredient(new Ingredient("Ham", 3));

        customPizza.showIngredients();
        System.out.println(customPizza.getCost());


    }
}
