/**
 * Wrapper class. Represents one of the 2 types of packing an item can be (Bottle or Wrapper)
 */
public class Wrapper implements Packing
{
    /**
     * Implements pack method in Packing interface
     * @return - String name of the packing type, Wrapper
     */
    @Override
    public String pack()
    {
        return "Wrapper";
    }
}
