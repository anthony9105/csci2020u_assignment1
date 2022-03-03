/**
 * VegBurger class, the child class of Burger
 */
public class VegBurger extends Burger
{
    /**
     * implements price method from Burger
     * @return - float price of a vegetable burger
     */
    @Override
    public float price()
    {
        return 2.50f;
    }

    /**
     * implements name method from Burger
     * @return - String name of a vegetable burger
     */
    @Override
    public String name()
    {
        return "Veg Burger";
    }

    /**
     * implements calories method from Burger
     * @return - int calories of a vegetable burger
     */
    @Override
    public int calories()
    {
        return 240;
    }
}