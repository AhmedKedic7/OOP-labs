package lab11.SecondTask;

public class PayPalPaymentFactory implements PaymentFactory{
    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}
