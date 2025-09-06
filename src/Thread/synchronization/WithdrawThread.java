package Thread.synchronization;

class WithdrawThread extends Thread {
    private Account account;
    private int amount;

    public WithdrawThread(Account account, int amount, String name) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}