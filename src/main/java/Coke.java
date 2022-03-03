/**
 * Coke class, child class of ColdDrink class.  Represents one of the types of cold drinks
 */
public class Coke extends ColdDrink
{
    /**
     * Implements price method in ColdDrink
     * @return - float price of Coke
     */
    @Override
    public float price()
    {
        return 30.0f;
    }

    /**
     * Implements name method in ColdDrink
     * @return - String name of the cold drink, Coke
     */
    @Override
    public String name()
    {
        return "Coke";
    }
}