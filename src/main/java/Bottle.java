/**
 * Bottle class. Represents one of the 2 types of packing an item can be (Bottle or Wrapper)
 */
public class Bottle implements Packing
{
    /**
     * Implements pack method in Packing interface
     * @return - String name of the packing type, Bottle
     */
    @Override
    public String pack()
    {
        return "Bottle";
    }
}
