package factory;

import java.util.List;

public abstract class Pizza {

protected String name;
protected List<String> ingredients;
protected double price;
protected boolean lactoseFree;

    public Pizza(String name, List<String> ingredients, double price, boolean lactoseFree) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.lactoseFree = lactoseFree;
    }

    public void addIngredient(String ingredient){
        ingredients.add(ingredient);
    }

    public void cutThePizza(){
        System.out.println("Pizza cut into 8 pieces!");
    }
}
