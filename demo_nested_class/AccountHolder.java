package demo_nested_class;

public class AccountHolder {

  private Account account;
  private String name;
  public AccountHolder(){

  }

  public AccountHolder(AccountHolder accountHolder){
    this.account = account;
  }

  public Account createAccount (String AccountNo){
    return new Account(AccountNo);
  }

  public void setAccount(AccountHolder accountHolder){
    this.accountHolder = accountHolder;
  }

  public class Account { // Inner class
    private String accountNo;

public void printHolderName(){ // Inner Class instance method can access the outer class's instance variable
  System.out.println(name);
}

    public Account (String accountNo){
      this.accountNo = accountNo;
    }

    public void printHolderName() {
      System.out.println()
    }
}



public static void main(String[] args) {
  AccountHolder john = new AccountHolder();
  Account johAccount = john.createAccount("1234"); // john.new Account("1234");
  johnAccount.printHolderName();
}
}
