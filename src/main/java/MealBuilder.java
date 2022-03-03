import javax.swing.*;
import java.awt.*;

/**
 * MealBuilder class.  Used to build the Meal class instances
 */
public class MealBuilder extends JOptionPane
{
    /**
     * prepareVegMeal method which creates an instance of Meal, and adds preset items to this instance
     * Makes use of the JOptionPane UI
     * @return - Meal instance
     */
    public Meal prepareVegMeal()
    {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());  // vegMeal preset adds a vegetable burger without needing to ask the user

        UIManager.put("OptionPane.minimumSize",new Dimension(400,150));  // setting the dialog box to a bigger minimum size

        int drinkChoice = 0;
        String[] drinkOptions = {"Coke", "Pepsi", "None"};

        // getting the drink choice of the user.  0 is returned for Coke, 1 is returned for Pepsi
        drinkChoice = JOptionPane.showOptionDialog(null, "Prices:\nCoke: $3.00, " +
                        "Pepsi: $3.50\nCalories:\nCoke: 240, Pepsi: 250", "Select your drink choice",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, drinkOptions, drinkOptions[0]);

        // if the user clicks the "X" button in the top right, exit. (This button returns -1)
        if(drinkChoice == -1)
            System.exit(0);

        // adding the item that the user selected
        switch(drinkChoice)
        {
            case(0):
                meal.addItem(new Coke());
                break;
            case(1):
                meal.addItem(new Pepsi());
                break;
        }
        return meal;
    }

    /**
     * prepareNonVegMeal method which creates an instance of Meal, and adds preset items to this instance
     * Makes use of the JOptionPane UI
     * @return - Meal instance
     */
    public Meal prepareNonVegMeal()
    {
        Meal meal = new Meal();
        UIManager.put("OptionPane.minimumSize",new Dimension(400,150));  // setting the dialog box to a bigger minimum size

        int burgerChoice = 0;
        int drinkChoice = 0;
        String[] burgerOptions = {"Chicken Burger", "Beef Burger"};     // non-vegetable meal preset has 2 choices
        String[] drinkOptions = {"Coke", "Pepsi", "None"};

        // getting the user's burger choice. 0 is returned for Chicken burger, 1 is returned for Beef Burger
        burgerChoice = JOptionPane.showOptionDialog(null, "Prices:\nChicken Burger: $5.00, " +
                        "Beef Burger: $4.50\nCalories:\nChicken Burger: 221, Beef Burger: 274", "Select your food choice",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, burgerOptions, burgerOptions[0]);

        // if the user clicks the "X" button in the top right, exit. (This button returns -1)
        if (burgerChoice == -1)
            System.exit(0);

        // adding the item that the user chose
        switch(burgerChoice)
        {
            case(0):
                meal.addItem(new ChickenBurger());
                break;
            case(1):
                meal.addItem(new BeefBurger());
                break;
        }

        // getting the drink choice from the user.  0 is returned for Coke, 1 is returned for Pepsi
        drinkChoice = JOptionPane.showOptionDialog(null, "Prices:\nCoke: $3.00, " +
                        "Pepsi: $3.50\nCalories:\nCoke: 240, Pepsi: 250", "Select your drink choice",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, drinkOptions, drinkOptions[0]);

        // if the user clicks the "X" button in the top right, exit. (This button returns -1)
        if(drinkChoice == -1)
            System.exit(0);

        // adding the item chosen by the user
        switch(drinkChoice)
        {
            case(0):
                meal.addItem(new Coke());
                break;
            case(1):
                meal.addItem(new Pepsi());
                break;
        }

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

        int doneWithFood = 0;
        int response = 0;
        int doneWithDrinks = 0;

        // while loop to allow the user to add multiple (or no) burgers to the meal
        while (doneWithFood != 1 && response != 3)
        {
            String[] foodOptions = {"Veg Burger", "Chicken Burger", "Beef Burger", "None"};
            // getting the food choice from the user.  0 is returned for Veg burger, 1 is returned for Chicken burger,
            // 2 is returned for Beef Burger, 3 is returned for None
            response = JOptionPane.showOptionDialog(null, "Prices:\nVeg Burger: $2.50, " +
                            "Chicken Burger: $5.00, Beef Burger: $4.50\nCalories:\nVeg Burger: 240, Chicken Burger: 221, Beef Burger: 274", "Select your food choice",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, foodOptions, foodOptions[0]);

            // if the user clicks the "X" button in the top right, exit. (This button returns -1)
            if(response == -1)
                System.exit(0);

            // adding the chosen item to the meal
            switch(response)
            {
                case(0):
                    meal.addItem(new VegBurger());
                    break;
                case(1):
                    meal.addItem(new ChickenBurger());
                    break;
                case(2):
                    meal.addItem(new BeefBurger());
                    break;
            }

            // if the user selected "None", don't display this option for more burgers
            if (response != 3)
            {
                // getting a response from the user for if they would like to add another burger to the meal
                doneWithFood = JOptionPane.showConfirmDialog(null, "Would you like to add another burger?",
                        "Select Option", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            }

            // if the user clicks the "X" button in the top right, exit. (This button returns -1)
            if(doneWithFood == -1)
                System.exit(0);
        }

        response = 0;   // resetting response to 0
        // while loop to allow the user to add multiple (or no) drinks
        while(doneWithDrinks != 1 && response != 2)
        {
            // getting the drink choice from the user.  0 is returned for Coke, 1 is returned for Pepsi, and 2 is returned for None
            String[] drinkOptions = {"Coke", "Pepsi", "None"};
            response = JOptionPane.showOptionDialog(null, "Prices:\nCoke: $3.00, " +
                            "Pepsi: $3.50\nCalories:\nCoke: 240, Pepsi: 250", "Select your drink choice",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, drinkOptions, drinkOptions[0]);

            if(response == -1)
                System.exit(0);

            // adding the chosen item to the meal
            switch(response)
            {
                case(0):
                    meal.addItem(new Coke());
                    break;
                case(1):
                    meal.addItem(new Pepsi());
                    break;
            }

            // if the user selected "None", don't display this option for more burgers
            if (response != 2)
            {
                doneWithDrinks = JOptionPane.showConfirmDialog(null, "Would you like to add another drink?",
                        "Select Option", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            }

            // if the user clicks the "X" button in the top right, exit. (This button returns -1)
            if (doneWithDrinks == -1)
                System.exit(0);
        }
        return meal;
    }
}