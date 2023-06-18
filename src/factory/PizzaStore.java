package factory;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.cutThePizza();
        return pizza;
    }
    public abstract Pizza createPizza(String type);

}
