public class Main 
{
    public static void main(String[] args) 
    {
        PaymentGateway Gpay = new PaymentAdapter();
        PaymentGateway PhonePe = new PaymentAdapter();
        PaymentGateway PayTM = new PaymentAdapter();

        Gpay.pay(500);
        PhonePe.pay(1000);
        PayTM.pay(1500);
    }
}
