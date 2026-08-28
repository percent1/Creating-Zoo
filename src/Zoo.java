
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main class for the Creating Zoo application.
 *
 * This class provides a menu that allows the user
 * to interact with the animals in the zoo.
 */
public class Zoo {

    /**
     * Starts the Creating Zoo application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store the zoo animals.
        ArrayList<Animal> animals = new ArrayList<>();

        // Add the animals to the zoo.
        animals.add(new Tiger("Simba", 5));
        animals.add(new Dolphin("Flipper", 3));
        animals.add(new Penguin("Pingu", 2));

        int choice = 0;

        // Continue displaying the menu until the user chooses Exit.
        do {
            displayMenu();

            try {
                System.out.print("Choose an option: ");
                choice = scanner.nextInt();

                switch (choice) {

                    case 1:
                        displayAnimals(animals);
                        break;

                    case 2:
                        makeAnimalsEat(animals);
                        break;

                    case 3:
                        System.out.println();
                        System.out.println(
                                "Thank you for visiting Creating Zoo!"
                        );
                        break;

                    default:
                        System.out.println();
                        System.out.println(
                                "Invalid option. Please choose 1, 2, or 3."
                        );
                }

            } catch (InputMismatchException e) {

                // Handle input that is not an integer.
                System.out.println();
                System.out.println(
                        "Invalid input. Please enter a number."
                );

                // Remove the invalid input from the Scanner.
                scanner.nextLine();

                // Reset the choice so the menu continues.
                choice = 0;
            }

        } while (choice != 3);

        // Close the Scanner when the program finishes.
        scanner.close();
    }

    /**
     * Displays the main zoo menu.
     */
    public static void displayMenu() {

        System.out.println();
        System.out.println("================================");
        System.out.println("          CREATING ZOO");
        System.out.println("================================");
        System.out.println("1. View Animals");
        System.out.println("2. Make Animals Eat");
        System.out.println("3. Exit");
        System.out.println("================================");
    }

    /**
     * Displays information about all animals in the zoo.
     *
     * @param animals list containing the zoo animals
     */
    public static void displayAnimals(ArrayList<Animal> animals) {

        System.out.println();
        System.out.println("===== ZOO ANIMALS =====");

        // Loop through all animals in the ArrayList.
        for (Animal animal : animals) {

            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());

            // Call the animal's specific makeSound() method.
            animal.makeSound();

            System.out.println();
        }
    }

    /**
     * Makes each animal in the zoo eat.
     *
     * @param animals list containing the zoo animals
     */
    public static void makeAnimalsEat(ArrayList<Animal> animals) {

        System.out.println();
        System.out.println("===== FEEDING THE ANIMALS =====");

        // Loop through all animals in the ArrayList.
        for (Animal animal : animals) {

            // Check if the animal implements the Eat interface.
            if (animal instanceof Eat) {

                // Convert the Animal object to an Eat object.
                Eat eatingAnimal = (Eat) animal;

                // Make the animal eat.
                eatingAnimal.eat();
            }
        }
    }
}

