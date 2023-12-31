package lab11.SixthTask;

public class EspressoBuilder implements CoffeeBuilder {
    private Coffee coffee;

    public EspressoBuilder() {
        this.coffee = new Coffee();
    }

    @Override
    public void buildType() {
        coffee.setType("Espresso");
    }

    @Override
    public void buildSize() {
        coffee.setSize("Regular");
    }

    @Override
    public void buildToppings() {
        coffee.addTopping("Whipped Cream");
    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }
}
