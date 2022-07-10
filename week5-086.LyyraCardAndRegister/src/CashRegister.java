
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        double lunchprice = 2.50;
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        if(cashGiven >= lunchprice)
        {
            this.cashInRegister += lunchprice;
            this.economicalSold ++;
            return cashGiven - lunchprice;
        }
        // if not enough money given, all is returned and nothing else happens
        else
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        double lunchprice = 4.00;
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        if(cashGiven >= lunchprice)
        {
            this.cashInRegister += lunchprice;
            this.gourmetSold ++;
            return cashGiven - lunchprice;
        }
        // if not enough money given, all is returned and nothing else happens
        else
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card)
    {
        double lunchprice = 2.50;
        if(card.balance() >= lunchprice)
        {
            economicalSold ++;
            card.pay(lunchprice);
            return true;
            
        }
        else
        {
            return false;
        }
    }
    
    public boolean payGourmet(LyyraCard card)
    {
        double lunchprice = 4.00;
        if(card.balance() >= lunchprice)
        {
            gourmetSold ++;
            card.pay(lunchprice);
            return true;
            
        }
        else
        {
            return false;
        }
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum)
    {
        if(sum >= 0)
        {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }
    
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
