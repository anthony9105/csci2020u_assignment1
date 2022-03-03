/**
 * ColdDrink abstract class, the parent of Pepsi and Coke classes
 */
public abstract class ColdDrink implements Item
{
    /**
     * implementation of the packing method from item, which returns the packing type for a ColdDrink which is Bottle
     */
    @Override
    public Packing packing()
    {
        return new Bottle();
    }

    /**
     * overrides price method from Item interface
     * implemented in Coke and Pepsi child classes
     */
    @Override
    public abstract float price();
}
