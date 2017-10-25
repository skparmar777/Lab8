//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /**
     * Lists out the types of bank accounts.
     */
    public enum BankAccountType {
        /** a checking account.*/
        CHECKINGS,
        /** a savings account.*/
        SAVINGS,
        /** a student account.*/
        STUDENT,
        /** a workplace account.*/
        WORKPLACE
    }
   /** the account number.*/
    private int accountNumber;
    /** the account type.*/
    private BankAccountType accountType;
    /** the account balance.*/
    private double accountBalance;
    /** the owner name.*/
    private String ownerName;
    /** the interest rate.*/
    private double interestRate;
    /** the interest earned.*/
    private double interestEarned;

    /**
     *
     * @param name takes in user name
     * @param accountCategory takes in the account type
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
    }

    /**
     *
     * @param num takes in account number
     */
    public void setAccountNumber(final int num) {
        accountNumber = num;
    }
    /**
     * @return returns accountNumber.
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
    *
    * @param num takes in account balance
    */
    public void setAccountBalance(final double num) {
        accountBalance = num;
    }
    /**
     *
     * @return the account balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     *
     * @param name takes in owner name
     */
    public void setOwnerName(final String name) {
        ownerName = name;
    }
    /**
     *
     * @return the owner's name
     */
    public String getOwnerName() {
        return ownerName;
    }
    /**
     *
     * @param interest takes in the interest earned
     */
    public void setInterestEarned(final double interest) {
        interestEarned = interest;
    }
    /**
     *
     * @return the interest earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }
}
