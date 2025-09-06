package Thread.synchronization;

class DepositThread extends Thread {
    private Account account;
    private int amount;

    public DepositThread(Account account, int amount, String name) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}