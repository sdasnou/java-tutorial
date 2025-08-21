package OOPs.Abstraction;

public class MainAbstract {
    public static void main(String[] args) {
        // Pay using UPI
        PaymentGateway payment1 = new UpiPayment();
        payment1.pay(1000);

        // Pay using Credit Card
        PaymentGateway payment2 = new CreditCardPayment();
        payment2.pay(5000);

        // Pay using Net Banking
        PaymentGateway payment3 = new NetBankingPayment();
        payment3.pay(3000);
    }
}
