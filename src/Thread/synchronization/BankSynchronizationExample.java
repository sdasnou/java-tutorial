package Thread.synchronization;

public class BankSynchronizationExample {
    public static void main(String[] args) {
        Account account = new Account(1000); //initial balance 1000

        Thread t1 = new WithdrawThread(account, 700, "WithdrawThread-1");
        Thread t2 = new WithdrawThread(account, 500, "WithdrawThread-2");
        Thread t3 = new DepositThread(account, 300, "DepositThread-1");
        Thread t4 = new DepositThread(account, 1000, "DepositThread-2");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
