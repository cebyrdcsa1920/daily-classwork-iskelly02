public class Shoes
{
    private String brand;
    private int numOfShoes;
    private boolean wearShoes;
    private double missingShoes;

    public Shoes()
    {
        brand = "Vans";
        numOfShoes = 8;
        wearShoes = false;
        missingShoes = 2.5;
    }

    public Shoes(String brand, int numOfShoes, boolean wearShoes, double missingShoes)
    {
        this.brand = brand;
        this.numOfShoes = numOfShoes;
        this.wearShoes = wearShoes;
        this.missingShoes = missingShoes;
    }
}