// Customer - Rushil Desai
public class Customer
{
    private String CustomerName;
    private int UniqueIDnumber;

    // Constructs a Customer with given name and ID number
    public Customer (String name, int idNum)
    {
        this.CustomerName = name;
        this.UniqueIDnumber = idNum;
    }

    // Returns the customer’s name
    public String getName()
    {
        return CustomerName;
    }

    // Returns the customer’s id
    public int getID()
    {
        return UniqueIDnumber;
    }

    // Returns a string of the customer
    public String toString()
    {
        return "Customer Name: " + CustomerName + "\tID Number: " + UniqueIDnumber;
    }

    // Compares two customers 
    public int compare(Customer other)
    {
        if (other.UniqueIDnumber > UniqueIDnumber) {
            return -1;
        } else if (other.UniqueIDnumber < UniqueIDnumber) {
            return 1;
        } else {
            return 0;
        }
    }
}
