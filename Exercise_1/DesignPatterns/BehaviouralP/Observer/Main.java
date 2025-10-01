// Entry Point

public class Main 
{
    public static void main(String[] args) 
    {
        Store store = new Store();
        store.subscribe(new Customer("Vicky"));
        store.subscribe(new Customer("Hamton"));

        store.notifyAllCustomers("New Phone Launch");
    }
}
