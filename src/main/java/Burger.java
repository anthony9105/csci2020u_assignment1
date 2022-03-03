/**
 * Burger abstract class, the parent class of VegBurger, ChickenBurger, BeefBurger classes
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
     * implemented in VegBurger, ChickenBurger, BeefBurger child classes
     */
    @Override
    public abstract float price();

    /**
     * overrides calories method from Item interface
     * implemented in VegBurger, ChickenBurger, and BeefBurger child classes
     */
    @Override
    public abstract int calories();
}