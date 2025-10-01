public class Main 
{
    public static void main(String[] args) 
    {
        VehicleFactory factory = new VehicleFactory();

        Vehicle v1 = factory.getVehicle("car");
        Vehicle v2 = factory.getVehicle("bike");

        v1.drive();
        v1.enginecc();
        v1.color();

        v2.drive();
        v2.enginecc();
        v2.color();

    }
}
