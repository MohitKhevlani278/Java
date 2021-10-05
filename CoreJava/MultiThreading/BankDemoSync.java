class Account {
    private int balance = 0;
    synchronized void deposit(int amount)
    {
        balance += amount;
    }

    int getBalance() {
        return balance;
    }
}

class customer extends Thread {
    Account account;

    customer(Account account) {
        this.account = account;
    }

    public void run() {
        try {
            for (int i = 0; i < 100000; i++) {
                account.deposit(10);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class BankDemoSync {
    private final static int MAX_CUSTOMERS = 10;

    public static void main(String[] args) {

        // Create Account
        Account account = new Account();

        // Create and start customer thread
        customer customerArr[] = new customer[MAX_CUSTOMERS];
        for (int i = 1; i < MAX_CUSTOMERS; i++) {
            customerArr[i] = new customer(account);
            customerArr[i].start();
        }

        // Wait for the customer thread complete
        for (int i = 0; i < MAX_CUSTOMERS; i++) {
            try {
                customerArr[i].join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Final Balance " + account.getBalance());
    }
}
