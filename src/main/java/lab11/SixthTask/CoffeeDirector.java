package lab11.SixthTask;

public class CoffeeDirector {
    public void constructCoffee(CoffeeBuilder builder) {
        builder.buildType();
        builder.buildSize();
        builder.buildToppings();
    }
}
