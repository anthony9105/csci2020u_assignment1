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
    private final float FOOD_TAX_RATE = 0.13f;

    /**
     * addItem method used to add an item to the meal
     * @param item - Item object representing a specific item (ex: a veg burger)
     */
    public void addItem(Item item)
    {
        items.add(item);
    }

    /**
     * getCost method used to get the total cost of the meal before taxes (subtotal)
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
        String[] prices = new String[items.size()];
        String[] packings = new String[items.size()];
        int[] calories = new int[items.size()];

        String summaryMessage = "";

        UIManager.put("OptionPane.minimumSize",new Dimension(400,150));  // setting the dialog box to a bigger minimum size

        // for loop to make a summary message of the items and costs, to put in a JOptionPane dialog box
        for (int i=0; i < items.size(); i++)
        {
            names[i] = items.get(i).name();
            prices[i] = String.format("%.02f",items.get(i).price());
            packings[i] = items.get(i).packing().pack();
            calories[i] = items.get(i).calories();
            summaryMessage += "Item "+(i+1)+": "+names[i]+", Packing: "
                    +packings[i]+", Calories: "+calories[i]+", Price: $"+prices[i] + "\n";
        }
        // additional information about the meal
        summaryMessage += "\nSubtotal: $" + String.format("%.02f",getCost());
        summaryMessage += "\nTax (13%): $"+ String.format("%.02f", getTax(getCost()));
        summaryMessage += "\nTotal: $"+ String.format("%.02f",getCost() + getTax(getCost()));
        summaryMessage += "\n\nTotal calories: "+getTotalCalories(calories);
        summaryMessage += "\n\nItem types:\nFood Items: "+getFoodItemsAmount()+", Drink Items: "+getDrinkItemsAmount();

        // displaying the summary to the user
        JOptionPane.showMessageDialog(null, summaryMessage,"Meal Summary", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * getTax method used to calculate the tax on the meal subtotal
     * @param subtotal - float subtotal in $
     * @return - float tax amount in $
     */
    public float getTax(float subtotal)
    {
        return subtotal * FOOD_TAX_RATE;
    }

    /**
     * getTotalCalories method used to calculate the total calories of the meal
     * @param calories - int[] calories array with all the item's calorie values
     * @return - int total calories
     */
    public int getTotalCalories(int[] calories)
    {
        int totalCalories = 0;
        for (int i=0; i < calories.length; i++)
        {
            totalCalories += calories[i];
        }

        return totalCalories;
    }

    /**
     * getFoodItemsAmount method used to calculate the number of food items in the meal
     * @return - int amount of food items
     */
    public int getFoodItemsAmount()
    {
        int foodItemsAmount = 0;
        for (int i=0; i < items.size(); i++)
        {
            // if the item packing type is "Wrapper" it is a food item
            if (items.get(i).packing().pack().equals("Wrapper"))
                foodItemsAmount++;
        }

        return foodItemsAmount;
    }

    /**
     * getDrinkItemsAmount method used to calculate the number of drink items in the meal
     * @return - int number of drink items
     */
    public int getDrinkItemsAmount()
    {
        int drinkItemsAmount = 0;
        for (int i=0; i < items.size(); i++)
        {
            // if the item packing type is "Bottle" it is a drink
            if (items.get(i).packing().pack().equals("Bottle"))
                drinkItemsAmount++;
        }

        return drinkItemsAmount;
    }
}