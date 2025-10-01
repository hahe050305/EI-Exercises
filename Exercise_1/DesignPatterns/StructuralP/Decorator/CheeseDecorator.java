public class CheeseDecorator implements Pizza 
{
    private Pizza pizza;
    public CheeseDecorator(Pizza p){ this.pizza = p; }
    
    public String getDescription(){ return pizza.getDescription() + " + Cheese"; }
}
