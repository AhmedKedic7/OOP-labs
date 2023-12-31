package lab11.SecondTask;

public class PayPalPayment implements Payment{
    @Override
    public void processPayment(){
        System.out.println("Processing PayPal payment...");
    }
}
