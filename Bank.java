
/**
 * A Bank, to record and maintain information about bank accounts
 * 
 * @author Iain Martin, C. Ramsay
 * @version 1.0
 */
public class Bank
{
    // fields - in this case, a collection of bank account objects
    private BankAccount testAccount1;
    private BankAccount testAccount2;

    /**
     * Constructor for objects of class Bank
     */
    public Bank()
    {
        // create instances of the bank account objects
        testAccount1 = new BankAccount();
        testAccount2 = new BankAccount(100.0);
    }
    
    /**
     * The main method
     */
    public static void main(String[] args)
    {
        // create instance of the Bank class
        Bank myBank = new Bank();
        
        // call method to display the balance of all accounts
        myBank.displayAllBalances();
        
        // run various tests for the bank
        myBank.doGeneralTests();
    }

    /**
     * Display the balance for all bank accounts
     */
    public void displayAllBalances()
    {
        // call method on each bank account object
        // in turn to display the bank account details
        testAccount1.displayAccountSummary();
        testAccount2.displayAccountSummary();
    }
   
    /**
     * A method for general tests
     */
    public void doGeneralTests()
    {
        // create a new bank account object
        BankAccount account1 = new BankAccount();
        account1.setBalance(100);
        account1.setCustomerName("Craig");
        
        // create a new bank account object #version 2
        BankAccount account2 = new BankAccount(100, "Craig");
        
        // create a new bank account object #version 3
        BankAccount account3 = new BankAccount(100);
        Customer c = new Customer("Craig");
        account3.setCustomer(c);

        // create a new bank account object #version 4
        Customer c2 = new Customer("Craig");
        BankAccount account4 = new BankAccount(100, c2);
        
        // get the name of the customer 
        String name = account4.getCustomerName();
        
        // get the name of the customer #version 2
        Customer c3 = account4.getCustomer();
        String name2 = c3.getName();

        // set the name of the customer 
        account4.setCustomerName("Not Craig");
        
    }
    
    
}
