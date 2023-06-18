import factory.Pizza;
import factory.RistoPizzaDaMario;
import factory.RistoPizzaSottoCasa;

public class Main {

    public static void main(String[] args) {
        RistoPizzaDaMario pizzaDaMario = new RistoPizzaDaMario();
        Pizza pizza1 = pizzaDaMario.orderPizza("boscaiola");
        System.out.println(pizza1);
        RistoPizzaSottoCasa ristoPizzaSottoCasa = new RistoPizzaSottoCasa();
        Pizza pizza2 = ristoPizzaSottoCasa.orderPizza("margherita");
        System.out.println(pizza2);
    }

}