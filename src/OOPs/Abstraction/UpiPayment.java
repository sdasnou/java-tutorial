package OOPs.Abstraction;

class UpiPayment implements PaymentGateway {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via UPI.");
    }
}