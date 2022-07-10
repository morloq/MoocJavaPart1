
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment)
    {
        return this.squareMeters > otherApartment.squareMeters;
        /*if(this.squareMeters > otherApartment.squareMeters)
        {
            return true;
        }
        return false;*/
    }
    
    public int priceDifference(Apartment otherApartment)
    {
        int price = squareMeters * pricePerSquareMeter;
        int pricediff = price - (otherApartment.squareMeters * otherApartment.pricePerSquareMeter);
        if (pricediff < 0)
        {
            pricediff = pricediff * (-1);
        }
        return pricediff;
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment)
    {
        int price = squareMeters * pricePerSquareMeter;
        if(price > (otherApartment.squareMeters * otherApartment.pricePerSquareMeter))
        {
            return true;
        }
        return false;
    }
}