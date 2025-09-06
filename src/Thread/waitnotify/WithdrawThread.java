package Thread.waitnotify;

public class  WithdrawThread extends Thread {
    private Account account;
    private int amount;

    public WithdrawThread(Account account, int amount, String name) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            account.withdraw(amount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}