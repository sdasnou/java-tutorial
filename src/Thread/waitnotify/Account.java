package Thread.waitnotify;
class Account {
    private int balance = 0;

    public synchronized void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " wants to withdraw " + amount);

        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting for deposit...");
            wait(); // releases lock until notified
        }

        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
    }

    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " deposited " + amount);
        balance += amount;
        System.out.println("Updated balance: " + balance);
        notifyAll(); // wake up all waiting threads
    }
}