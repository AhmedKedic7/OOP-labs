package lab11.SixthTask;

public class LatteBuilder implements CoffeeBuilder {
    private Coffee coffee;

    public LatteBuilder() {
        this.coffee = new Coffee();
    }

    @Override
    public void buildType() {
        coffee.setType("Latte");
    }

    @Override
    public void buildSize() {
        coffee.setSize("Large");
    }

    @Override
    public void buildToppings() {
        coffee.addTopping("Caramel Syrup");
        coffee.addTopping("Cinnamon Powder");
    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }
}
