import java.util.Arrays;

public class Account implements Transferable {
  private int balance; // derived by transactions

  private Transaction[] transactions;
  private AccountHolder accountHolder;


  // Create Account, accountHolder must be there.
  public Account(AccountHolder accountHolder) {
    this.balance = 0;
    this.accountHolder = accountHolder;
    this.transactions = new Transaction[0];
  }

  public Account(String name, int age) {
    this.balance = 0;
    this.accountHolder = new AccountHolder(name, age);
  }

  private void addTransactions(Transaction transaction) {
    Transaction[] newArr =
        Arrays.copyOf(this.transactions, this.transactions.length + 1);
    newArr[newArr.length - 1] = transaction;
    this.transactions = newArr;
  }

  public int balance() {
    int sum = 0;
    for (int i = 0; i < this.transactions.length; i++) {
      // isCredit true / false
      if (this.transactions[i].isCredit())
        sum += this.transactions[i].getAmount();
    }
    return sum;
  }

  // private String type; // Saving, ABC, etc ...

  public boolean credit(int amount) { // add
    return this.addTransactions(Transaction.now(true, amount));
  }

  public boolean debit(int amount) { // deduct
    if (this.balance < amount)
      return false;

    return this.addTransactions(Transaction.now(false, amount));
  }

  @Override
  public boolean transfer(Account to, int amount) {
    if (amount <= 0)
      return false;
    if (!this.debit(amount))
      return false;
    if (!to.credit(amount))
      return false;
    return true;
    // credit account
    // add transaction

  }

  public static void main(String[] args) {
    Account johnAccount = new Account("John", 30);
    johnAccount.credit(3000);
    johnAccount.credit(1500);
    johnAccount.credit(4000);
    // account.addTransactions(Transaction.now(true, 3000));
    // account.addTransactions(Transaction.now(true, 1500));
    // account.addTransactions(Transaction.now(true, 4000));
    System.out.println((account.balance())); // 500
    
  }
}

