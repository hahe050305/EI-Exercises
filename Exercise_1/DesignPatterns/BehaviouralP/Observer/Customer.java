// "Notifying the customers "

public class Customer implements Observer 
{
    private String name;

    public Customer(String name)
    { 
        this.name = name; 
    }

    public void update(String product)
    {
        System.out.println(name + " notified: " + product + " is now available!");
    }
}
