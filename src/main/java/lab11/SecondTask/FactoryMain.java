package lab11.SecondTask;

public class FactoryMain {
    public static void main(String[] args) {

        PaymentFactory creditCardFactory = new CreditCardPaymentFactory();
        Payment creditCardPayment = creditCardFactory.createPayment();
        creditCardPayment.processPayment();


        PaymentFactory payPalFactory = new PayPalPaymentFactory();
        Payment payPalPayment = payPalFactory.createPayment();
        payPalPayment.processPayment();
    }
}
