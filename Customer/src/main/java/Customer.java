// Класс Customer представляет клиента банка
public class Customer {
    private String name;
    private BankAccount account;
    private int creditRating;

    public Customer(String name, BankAccount account, int creditRating) {
        this.name = name;
        this.account = account;
        this.creditRating = creditRating;
    }

    public String getName() {
        return name;
    }

    public BankAccount getAccount() {
        return account;
    }

    public int  getCreditRating() { return creditRating; }
}