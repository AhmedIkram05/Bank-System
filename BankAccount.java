
/**
 * Holds details of a Bank Account and facilitates access to funds.
 * 
 * @author Iain Martin, C. Ramsay 
 * @version 1.0
 */
public class BankAccount
{
    /** records the balance of the account */
    private double balance;
    
    /** the customer who owns this account */
    private Customer accountOwner;

    /**
     * Default constructor - initialise fields to default values
     */
    public BankAccount()
    {
        balance = 0; // no balance yet
        accountOwner = new Customer(); // default, unknown customer
    }
    
    /**
     * Alternative constructor - initialise account with an opening balance
     * 
     * @param openingBalance The opening balance of the account
     */
    public BankAccount(double openingBalance)
    {
        balance = openingBalance; // set to opening balance
        accountOwner = new Customer(); // default, unknown customer
    }
    
    /**
     * Alternative constructor - initialise account with an opening balance
     * AND customer details (their name)
     * 
     * @param openingBalance The opening balance of the account
     * @param name The name of the customer for the account
     */
    public BankAccount(double openingBalance, String name)
    {
        balance = openingBalance; // set account to balance given       
        accountOwner = new Customer(name); // create a new customer with a given name
    }
    
    /**
     * Alternative constructor - initialise account with an opening balance
     * AND a customer
     * 
     * @param openingBalance The opening balance of the account
     * @param c The customer for the account
     */
    public BankAccount(double openingBalance, Customer c)
    {
        balance = openingBalance;  // set account to balance given      
        accountOwner = c; // set account owner to given customer 'c'
    }
    
    /**
     * Sets the balance of the account to the given value
     * 
     * @param newBalance The new balance for the account
     */
    public void setBalance(double newBalance)
    {
        balance = newBalance;
    }
    
    /**
     * Returns the current balance of the account
     * 
     * @return The account balance
     */
    public double getBalance()
    {
        return balance;
    }
    
    /**
     * Sets the customer / owner of the account
     * 
     * @param c The account owner
     */
    public void setCustomer(Customer c)
    {
        accountOwner = c;
    }
    
    /**
     * Get the customer / owner of the account
     * 
     * @return The account owner
     */
    public Customer getCustomer()
    {
        return accountOwner;
    }
    
    /**
     * Get the name of customer / owner of the account
     * 
     * @return The customer's name
     */
    public String getCustomerName()
    {
        return accountOwner.getName();
    }
    
    /**
     * Set the name of customer / owner of the account
     * 
     * @param name The customer's name
     */
    public void setCustomerName(String name)
    {
        accountOwner.setName(name);
    }
    
    /**
     * Get any interest due on the account
     * 
     * @return The interest due
     */
    public double getInterest()
    {
        double interestRate = 0.02;
        double interest = balance * interestRate;
        return interest;
    }
    
    /**
     * Display a summary of the account details.
     */
    public void displayAccountSummary()
    {
        System.out.println("#################");    
        System.out.println("Your Bank summary");
        System.out.println("Balance: " + getBalance() + " pounds"); 
        System.out.println("Interest due: " + getInterest() + " pounds");   
        System.out.println("Owner of account is: " + getCustomerName());
        System.out.println("################");
        System.out.println("");
    }
}
