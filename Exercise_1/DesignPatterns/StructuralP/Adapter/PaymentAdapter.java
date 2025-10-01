public class PaymentAdapter implements PaymentGateway 
{
    private OldPaymentProcessor oldProcessor = new OldPaymentProcessor();

    public void pay(int amount) 
    {
        oldProcessor.makePayment(amount);
    }
}
