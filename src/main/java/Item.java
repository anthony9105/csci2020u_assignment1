/**
 * Item interface used by Meal class.  Has 4 methods:
 * name, packing, price, and calories which are implemented in several classes
 */
public interface Item
{
    public String name();       // implemented in every specific item class (ChickenBurger, VegBurger, BeefBurger, Pepsi, Coke)

    public Packing packing();   // implemented in the food or drink category classes (Burger, ColdDrink)
                                // (Burger uses "Wrapper" packing, and ColdDrink uses "Bottle" packing)

    public float price();       // implemented in the food or drink category classes (Burger, ColdDrink),
                                // and every specific item class (ChickenBurger, VegBurger, BeefBurger, Pepsi, Coke)

    public int calories();      // implemented in the food or drink category classes (Burger, ColdDrink),
                                // and every specific item class (ChickenBurger, VegBurger, BeefBurger, Pepsi, Coke)
}
