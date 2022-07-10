
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added)
    {
        int euros = added.euros + this.euros;
        int cents = added.cents + this.cents;
        Money money = new Money(euros, cents);
        return money;
    }
    
    public boolean less(Money compared)
    {
        if(this.euros < compared.euros)
        {
            return true;
        }
        else if(this.euros == compared.euros && this.cents < compared.cents)
        {
            return true;
        }
        else
            return false;
    }

    public Money minus(Money decremented)
    {
        
        
        Money money = new Money(0, 0);
        int cents = this.cents();
        double c = cents/100 + this.euros;
        int centsd = decremented.cents;
        double d = centsd/100 + decremented.euros;
        
        
        int value1 = 0;
        int value2 = 0;
        
        
        if(c - d < 0)
        {
            money = new Money(0,0);
            return money;
        }
        else//if value not negative
        {
            if(this.cents - decremented.cents < 0)
            {
                 value1 = 100 - Math.abs(this.cents -decremented.cents);
                 value2 = (this.euros-1) - decremented.euros;
                 money = new Money(value2, value1);
                 return money;
            }
            else
            {
                value1 = this.cents - decremented.cents;
                value2 = this.euros - decremented.euros;
                money = new Money(value2, value1);
                return money;
            }
            
        }
    }
}
