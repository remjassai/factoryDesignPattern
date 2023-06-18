package factory;

import java.util.Arrays;

public class PizzaTypeMargherita extends Pizza{

    public PizzaTypeMargherita(){
        super("margherita", Arrays.asList("Mozzarella","Pomodoro","Basilico"),5.00,false);
    }

    @Override
    public String toString() {
        return "Pizza: " + super.name+ ", Ingredients: " + super.ingredients + " Price: " + super.price +"€ " + " LactoseFree: " + lactoseFree ;
    }
}
