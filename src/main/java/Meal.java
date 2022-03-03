import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Meal class used to store the items of the meal instance, and has methods to calculate the total cost, and display the items
 */
public class Meal extends JOptionPane
{
    private List<Item> items = new ArrayList<Item>();

    /**
     * addItem method used to add an item to the meal
     * @param item - Item object representing a specific item (ex: a veg burger)
     */
    public void addItem(Item item)
    {
        items.add(item);
    }

    /**
     * getCost method used to get the total cost of the meal
     * @return - float cost
     */
    public float getCost()
    {
        float cost = 0.0f;

        for (Item item : items)
        {
            cost += item.price();
        }
        return cost;
    }

    /**
     * showItems method used to display the items, individual costs, and total cost of the meal instance
     * Makes use of the JOptionPane UI
     */
    public void showItems()
    {
        // arrays to store values
        String[] names = new String[items.size()];
        float[] prices = new float[items.size()];
        String[] packings = new String[items.size()];

        String summaryMessage = "";

        UIManager.put("OptionPane.minimumSize",new Dimension(400,150));  // setting the dialog box to a bigger minimum size

        // for loop to make a summary message of the items and costs, to put in a JOptionPane dialog box
        for (int i=0; i < items.size(); i++)
        {
            names[i] = items.get(i).name();
            prices[i] = items.get(i).price();
            packings[i] = items.get(i).packing().pack();
            summaryMessage += "Item : "+names[i]+", Packing : "
                    +packings[i]+", Price : $"+prices[i] + "\n";
        }
        summaryMessage += "\nTotal Cost: $" + getCost();

        // displaying the summary to the user
        JOptionPane.showMessageDialog(null, summaryMessage,"Meal Summary", JOptionPane.INFORMATION_MESSAGE);
    }
}