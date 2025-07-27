public class OOPs {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        System.out.println("Initial Pen Details:");
        System.out.println("Name: " + p1.name); // null
        System.out.println("Color: " + p1.color); // null
        System.out.println("Price: " + p1.price); // 0

        p1.setName("Ballpoint Pen");
        p1.setColor("Blue");
        p1.setPrice(10);

        System.out.println("Updated Pen Details:");
        System.out.println("Name: " + p1.name); // Ballpoint Pen
        System.out.println("Color: " + p1.color); // Blue
        System.out.println("Price: " + p1.price); // 10

        BankAccount account = new BankAccount();
        account.setAccountNumber("123456789");
        account.setAccountHolderName("Jay Govind");
        account.setPin(1604);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("PIN: " + account.getPin());

        // Note: Direct access to private fields is not allowed, hence we use getters
        // and setters.
        // System.out.println(account.accountNumber); // This line would cause an error
    }
}

class Pen {
    String name;
    String color;
    int price;

    void setName(String newName) {
        name = newName;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setPrice(int newPrice) {
        price = newPrice;
    }
}

class BankAccount {
    private String accountNumber;
    protected String accountHolderName;
    private int pin;

    // setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    // getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getPin() {
        return pin;
    }

}