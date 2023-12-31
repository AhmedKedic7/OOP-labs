package lab11.SecondTask;

public class CreditCardPayment implements Payment{
    @Override
    public void processPayment(){
        System.out.println("Processing CreditCard payment...");
    }
}
