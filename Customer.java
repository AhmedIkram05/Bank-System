
/**
 * Represents a Customer of the bank
 *
 * @author C. Ramsay
 * @version 1.0
 */
public class Customer
{
    /** the customer's name */
    private String name;

    /**
     * Default constructor
     */
    public Customer()
    {
        name = "";
    }

    /**
     * Alternative constructor
     * 
     * @param cName The name of the customer
     */
    public Customer(String cName)
    {
        name = cName;
    }

    /**
     * Get the customer's name
     * 
     * @return The name of the customer
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set the customer's name
     * 
     * @param cName The name of the customer
     */
    public void setName(String cName)
    {
        name = cName;
    }
}
