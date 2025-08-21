package OOPs.Abstraction;

class CreditCardPayment implements PaymentGateway {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via Credit Card.");
    }
}
