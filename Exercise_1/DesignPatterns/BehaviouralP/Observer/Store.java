// "To create a list of customers who had susbscribed and notify them when a product has been launched"

import java.util.*;

public class Store 
{
    private List<Observer> customers = new ArrayList<>();

    public void subscribe(Observer o)
    { 
        customers.add(o);
    }

    public void notifyAllCustomers(String product)
    {
        for(Observer c : customers) 
            c.update(product);
    }
}
