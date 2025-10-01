public class Main 
{
    public static void main(String[] args) 
    {
        Pizza p = new OlivesDecorator(new CheeseDecorator(new BasicPizza()));
        System.out.println(p.getDescription());
    }
}
