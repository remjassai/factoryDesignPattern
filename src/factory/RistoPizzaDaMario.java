package factory;

public class RistoPizzaDaMario extends PizzaStore{
    @Override
    public Pizza createPizza(String type){
        Pizza pizza;
        switch (type){
            case "margherita":
                pizza = new PizzaTypeMargherita();
                break;
            case "boscaiola" :
                pizza = new PizzaTypeBoscaiola();
                break;
            default: throw new IllegalArgumentException("No such a pizza here!");
        }
        return pizza;
    }
}
