/**
 * Burger abstract class, the parent class of VegBurger and ChickenBurger classes
 */
public abstract class Burger implements Item
{
    /**
     * implementation of the packing method from item, which returns the packing type for a Burger which is Wrapper
     */
    @Override
    public Packing packing()
    {
        return new Wrapper();
    }

    /**
     * overrides price method from Item interface
     * implemented in VegBurger and ChickenBurger child classes
     */
    @Override
    public abstract float price();
}