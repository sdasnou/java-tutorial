package Thread.waitnotify;

public class BankAccountExample {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();

        // Multiple withdrawal threads
        WithdrawThread w1 = new WithdrawThread(account, 1000, "WithdrawThread-1");
        WithdrawThread w2 = new WithdrawThread(account, 500, "WithdrawThread-2");

        // Deposit threads
        DepositThread d1 = new DepositThread(account, 700, "DepositThread-1");
        DepositThread d2 = new DepositThread(account, 1000, "DepositThread-2");

        // Start threads
        w1.start();
        w2.start();

        Thread.sleep(2000); // let withdrawals wait

        d1.start();
        d2.start();
    }
}
