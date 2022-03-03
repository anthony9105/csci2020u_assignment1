/**
 * Pepsi class, child class of ColdDrink class.  Represents one of the types of cold drinks
 */
public class Pepsi extends ColdDrink
{
    /**
     * Implements price method in ColdDrink
     * @return - float price of Pepsi
     */
    @Override
    public float price()
    {
        return 35.0f;
    }

    /**
     * Implements name method in ColdDrink
     * @return - String name of the cold drink, Pepsi
     */
    @Override
    public String name()
    {
        return "Pepsi";
    }
}