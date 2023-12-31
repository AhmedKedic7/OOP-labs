package lab11.SixthTask;

public class BuilderMain {
    public static void main(String[] args) {
        CoffeeDirector coffeeDirector = new CoffeeDirector();

        EspressoBuilder espressoBuilder = new EspressoBuilder();
        coffeeDirector.constructCoffee(espressoBuilder);
        Coffee espressoCoffee = espressoBuilder.getCoffee();
        System.out.println("Espresso Coffee: " + espressoCoffee);

        LatteBuilder latteBuilder = new LatteBuilder();
        coffeeDirector.constructCoffee(latteBuilder);
        Coffee latteCoffee = latteBuilder.getCoffee();
        System.out.println("Latte Coffee: " + latteCoffee);

        CappuccinoBuilder cappuccinoBuilder = new CappuccinoBuilder();
        coffeeDirector.constructCoffee(cappuccinoBuilder);
        Coffee cappuccinoCoffee = cappuccinoBuilder.getCoffee();
        System.out.println("Cappuccino Coffee: " + cappuccinoCoffee);
    }
}
