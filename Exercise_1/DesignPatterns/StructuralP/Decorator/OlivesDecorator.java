public class OlivesDecorator implements Pizza 
{
    private Pizza pizza;

    public OlivesDecorator(Pizza p){ this.pizza = p; }
    
    public String getDescription(){ return pizza.getDescription() + " + Olives"; }
}
