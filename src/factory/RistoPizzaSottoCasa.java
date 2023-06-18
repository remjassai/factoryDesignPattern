package factory;

public class RistoPizzaSottoCasa extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type){
            case "margherita":
                pizza = new PizzaTypeMargherita();
                break;
            default: throw new IllegalArgumentException("No such a pizza here!");
        }
        return pizza;
    }
}
