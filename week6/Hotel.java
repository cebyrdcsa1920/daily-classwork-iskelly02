import java.awt.Color;

public class Hotel
{
    private String hotelName;
    private Color color;
    private int numOfBeds;
    private boolean clean;
    private double bathroom;

    public Hotel()
    {
        hotelName = "Mango";
        color = Color.RED;
        numOfBeds = 3;
        clean = true;
        bathroom = 1.5;
    }

    public Hotel(String hotelName, Color color, int numOfBeds, boolean clean, double bathroom)
    {
        this.hotelName = hotelName;
        this.color = color;
        this.numOfBeds = numOfBeds;
        this.clean = clean;
        this.bathroom = bathroom;
    }
}