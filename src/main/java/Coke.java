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
        return 3.00f;
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

    /**
     * implements calories from ColdDrink
     * @return - int amount of calories of a bottle of Coke
     */
    @Override
    public int calories()
    {
        return 240;
    }
}