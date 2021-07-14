package structural.decorator;

import java.util.ArrayList;
import java.util.List;

public class BasePizza implements Pizza{

    private List<Ingredient> ingredients;
    private int cost = 11;

    public BasePizza() {
        this.ingredients =  new ArrayList<>();
        ingredients.add(new Ingredient("Tomato souce", 1));
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);

    }

    @Override
    public int getCost() {
        int totalCost = cost;
        for (Ingredient ingredient:ingredients) {
            totalCost = totalCost + ingredient.getCost();
        }
        return totalCost;
    }

    @Override
    public void showIngredients() {
        System.out.println(ingredients);
    }


}
