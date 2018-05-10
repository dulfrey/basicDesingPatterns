package builder;
public class Main {
	public static void main(String[] args) {
        Mesero mesero = new Mesero();
        PizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        mesero.setPizzaBuilder( hawaiianPizzabuilder );
        mesero.constructPizza();

        Pizza pizza = mesero.getPizza();
    }

}
