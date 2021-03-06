/**
 * ChickenBurger class, the child class of Burger
 */
public class ChickenBurger extends Burger
{
    /**
     * implements price method from Burger
     * @return - float price of a chicken burger
     */
    @Override
    public float price()
    {
        return 5.00f;
    }

    /**
     * implements name method from Burger
     * @return - String name of a chicken burger
     */
    @Override
    public String name()
    {
        return "Chicken Burger";
    }

    /**
     * implements calories from Burger
     * @return - int amount of calories of a chicken burger
     */
    @Override
    public int calories()
    {
        return 221;
    }
}