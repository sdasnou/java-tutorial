package OOPs.Abstraction;

class NetBankingPayment implements PaymentGateway {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via Net Banking.");
    }
}
