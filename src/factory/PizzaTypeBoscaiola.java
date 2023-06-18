package factory;

import java.util.Arrays;

public class PizzaTypeBoscaiola extends Pizza{
    public PizzaTypeBoscaiola(){
        super("boscaiola", Arrays.asList("funghi","salsiccia","mozzarella"),6.00,false);
    }

    @Override
    public String toString() {
        return "Pizza: " + super.name + ", Ingredients: " + super.ingredients + " Price: " + super.price +"€ " + " LactoseFree: " + lactoseFree;
    }
}
