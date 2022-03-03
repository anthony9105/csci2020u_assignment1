/**
 * BeefBurger class, the child class of Burger
 * Additional burger type
 */
public class BeefBurger extends Burger
{
    /**
     * implements price method from Burger
     * @return - float price of a beef burger
     */
    @Override
    public float price()
    {
        return 4.50f;
    }

    /**
     * implements name method from Burger
     * @return - String name of a beef burger
     */
    @Override
    public String name()
    {
        return "Beef Burger";
    }

    /**
     * implements calories from Burger
     * @return - int amount of calories of a beef burger
     */
    @Override
    public int calories()
    {
        return 274;
    }
}
