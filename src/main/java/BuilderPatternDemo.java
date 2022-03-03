/**
 * Anthony Liscio
 * Meal builder project - using the Design Pattern: Builder Pattern
 * Creates a meal of the user's choice and displays the costs and total costs of your final meal.
 * Uses a simple UI (JOptionPane) for user prompts and display messages
 */

import javax.swing.*;

/**
 * BuilderPatternDemo
 * This is the "main" class of this project.
 * This class creates and uses methods in a MealBuilder instance
 */
public class BuilderPatternDemo extends JOptionPane
{
    public static void main(String[] args)
    {
        int goAgain = 0;

        // while loop to allow the user to keep making different meals, if they choose to
        while(goAgain != 1)
        {
            MealBuilder mealBuilder = new MealBuilder();
            String[] mealTypeOptions = {"Veggie Meal", "Non-veggie Meal", "Custom Meal"};

            // getting the meal type from the user from the JOptionPane UI (option on the far left return 0 when clicked, next button: 1, next button: 2)
            int response = JOptionPane.showOptionDialog(null, "Select meal type",
                    "Meal Builder", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, mealTypeOptions, mealTypeOptions[0]);

            // stopping the program if the "X" button is clicked (it returns -1 when clicked)
            if(response == -1)
                System.exit(0);

            // creating the type of meal chosen by the user
            switch (response)
            {
                case (0):    // preset vegetable meal
                    Meal vegMeal = mealBuilder.prepareVegMeal();
                    vegMeal.showItems();
                    break;
                case (1):    // preset non-vegetable meal
                    Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
                    nonVegMeal.showItems();
                    break;
                case (2):    // user to make their own custom meal
                    Meal customMeal = mealBuilder.prepareCustomMeal();
                    customMeal.showItems();
                    break;
            }

            goAgain = JOptionPane.showConfirmDialog(null, "Would you like to build another meal?",
                    "Go Again?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            // stopping the program if the "X" button is clicked (it returns -1 when clicked)
            if(goAgain == -1)
                System.exit(0);
        }
    }
}