package nz.ac.auckland.softeng281.a1;

import java.util.Iterator;

public class Basics {

    /**
     * deposit operation
     *
     * @param currentBalance
     * @param amount
     * @param numOfTransactions
     * @param transactionsLimit
     * @return the new balance
     */
    public static double deposit(double currentBalance, double amount, int numOfTransactions, int transactionsLimit) {
        double newBalance= currentBalance + amount;
        double result;
        if (numOfTransactions<transactionsLimit){
          result=newBalance;
        }
        else {
          System.out.println("transactions limit reached");
          result= currentBalance;
        }
        return result;
    }

    /**
     * withdraw operation
     *
     * @param currentBalance
     * @param amount
     * @param numOfTransactions
     * @param transactionsLimit
     * @return the new balance
     */
    public static double withdraw(double currentBalance, double amount, int numOfTransactions, int transactionsLimit) {
        double newBalance=currentBalance-amount;
        double result;
        if (numOfTransactions>=transactionsLimit){
          System.out.println("transactions limit reached");
          result=currentBalance;
        }
        else if (numOfTransactions<transactionsLimit && newBalance<0){
          System.out.println("amount exceeded");
          result=currentBalance;
        }
        else {
          result=newBalance;
        }
        return result;
    }      
}
