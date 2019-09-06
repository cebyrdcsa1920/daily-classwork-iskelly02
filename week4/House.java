public class House
{
    private String model;
    private Color color;
    private int numBedrooms;
    private double numBathrooms;
    private int numPools;
    private String address;

    public House()
    {
        model = "Two-Story";
        color = Color.RED;
        numBedrooms = 6;
        numBathrooms = 5.5;
        numPools = 3;
        address = 12345 Jacksonville Drive;
    }

    public String toString()
    {
        return "This is my Two-Story House";
    }
}







