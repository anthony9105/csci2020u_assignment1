import javax.swing.*;
import java.awt.*;

/**
 * MealBuilder class.  Used to build the Meal class instances
 */
public class MealBuilder extends JOptionPane
{
    /**
     * prepareVegMeal method which creates an instance of Meal, and adds preset items to this instance
     * @return - Meal instance
     */
    public Meal prepareVegMeal()
    {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * prepareNonVegMeal method which creates an instance of Meal, and adds preset items to this instance
     * @return - Meal instance
     */
    public Meal prepareNonVegMeal()
    {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    /**
     * prepareCustomMeal class, an added method to this design pattern which prepares a custom meal chosen by the user,
     * and adds the chosen items to the created Meal instance
     * Makes use of the JOptionPane UI
     * @return - Meal instance
     */
    public Meal prepareCustomMeal()
    {
        Meal meal = new Meal();
        UIManager.put("OptionPane.minimumSize",new Dimension(400,150));  // setting the dialog box to a bigger minimum size

        String[] foodOptions = {"Veg Burger", "Chicken Burger"};
        // getting the food choice from the user.  0 for Veg burger and 1 for Chicken burger
        int response = JOptionPane.showOptionDialog(null, "Prices:\nVeg Burger: $25.0, Chicken Burger: $50.5", "Select your food choice",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, foodOptions, foodOptions[0]);

        // adding the chosen item to the meal
        if (response == 0)
        {
            meal.addItem(new VegBurger());
        }
        else if (response == 1)
        {
            meal.addItem(new ChickenBurger());
        }

        // getting the drink choice from the user.  0 for Coke and 1 for Pepsi
        String[] drinkOptions = {"Coke", "Pepsi"};
        response = JOptionPane.showOptionDialog(null, "Prices:\nCoke: $30.0, Pepsi: $35.0", "Select your drink choice",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, drinkOptions, drinkOptions[0]);

        // adding the chosen item to the meal
        if (response == 0)
        {
            meal.addItem(new Coke());
        }
        else if (response == 1)
        {
            meal.addItem(new Pepsi());
        }

        return meal;
    }
}