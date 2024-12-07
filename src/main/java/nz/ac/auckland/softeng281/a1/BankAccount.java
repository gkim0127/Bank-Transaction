package nz.ac.auckland.softeng281.a1;

/**
 * University of Auckland
 * SOFTENG 281 - SEMESTER 1 - 2021
 * ASSIGNMENT 1 (A1)
 * <p>
 * Bank Account Class
 */
public class BankAccount {
    private double initialBalance=0;
    private int transactionsLimit=0;
    private int numberOfTransactions=0;
    
    /**
     * Construct a BackAccount instance with given initial balance and transactions limit
     *
     * @param initialBalance
     * @param transactionsLimit
     */
    public BankAccount(double initialBalance, int transactionsLimit) {
    	this.initialBalance= initialBalance;
      this.transactionsLimit= transactionsLimit;
    }

    /**
     * Default constructor
     */
    public BankAccount() {
    	initialBalance=0.0;
      transactionsLimit=10;
    }

    /**
     * returns the current balance
     *
     * @return
     */
    public double getBalance() {
        return initialBalance;
    }

    /**
     * return the transaction limit associated to the account
     *
     * @return
     */
    public int getTransactionsLimit() {
        return transactionsLimit;
    }
    
    /**
     * Add the given amount to the balance
     *
     * @param amount
     */
    public void deposit(double amount) {
      numberOfTransactions++;
      if (numberOfTransactions<=transactionsLimit){
        initialBalance=initialBalance+amount;
      }
      else {
        System.out.println("transactions limit reached");
        
      }
    }

    /**
     * Subtract the given amount from balance
     *
     * @param amount
     */
    public void withdraw(double amount) {
      numberOfTransactions++;
      if (numberOfTransactions>transactionsLimit){
        System.out.println("transactions limit reached");
      }
      else if (numberOfTransactions<transactionsLimit && initialBalance<amount){
      System.out.println("amount exceeded");
      }
      else {
        initialBalance=initialBalance-amount;
      }
    }

    /**
     * Transfer the given amount to Account recipient
     *
     * @param amount
     * @param recipient
     */
   

public void transferTo(double amount, BankAccount recipient) {

  if (numberOfTransactions >= transactionsLimit || recipient.numberOfTransactions >= recipient.transactionsLimit) {
    System.out.println("transactions limit reached");
  }
 else if (initialBalance<amount){
    System.out.println("amount exceeded");
  }
  else if (initialBalance >= amount){
    initialBalance = initialBalance - amount;
    recipient.initialBalance = recipient.initialBalance + amount;
   }  
 }
}



