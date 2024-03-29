/* Написать программу для работы с банковскими счетами.
Программа должна позволять создавать новые счета, вносить и снимать деньги со счета,
а также показывать информацию о балансе счетов.*/
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("MyBank");
        BankAccount account = new BankAccount(123456789, 1000);
        Customer customer = new Customer("Alice", account, 0);

        System.out.println("Welcome to " + bank.getName() + "!");
        System.out.println("Customer " + customer.getName() + " has account number " + customer.getAccount().getAccountNumber() +
                " with balance " + customer.getAccount().getBalance() + " USD");
        System.out.println("Customer credit rating is " + customer.getCreditRating());

        customer.getAccount().deposit(500);
        customer.getAccount().withdraw(200);
        customer.getAccount().withdraw(2000);
    }
}