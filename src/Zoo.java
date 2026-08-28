
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
                        saveAnimalData(animals);
                        break;

                    case 4:
                        loadAnimalData();
                        break;

                    case 5:
                        System.out.println();
                        System.out.println(
                                "Thank you for visiting Creating Zoo!"
                        );
                        break;

                    default:
                        System.out.println();
                        System.out.println(
                                "Invalid option. Please choose 1, 2, 3, 4, or 5."
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

        } while (choice != 5);

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
        System.out.println("3. Save Animal Data");
        System.out.println("4. Load Animal Data");
        System.out.println("5. Exit");
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

        for (Animal animal : animals) {

            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());

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

        for (Animal animal : animals) {

            if (animal instanceof Eat) {

                Eat eatingAnimal = (Eat) animal;

                eatingAnimal.eat();
            }
        }
    }

    /**
     * Saves all zoo animals to their respective files.
     *
     * @param animals list containing the zoo animals
     */
    public static void saveAnimalData(ArrayList<Animal> animals) {

        System.out.println();
        System.out.println("===== SAVING ANIMAL DATA =====");

        for (Animal animal : animals) {

            if (animal instanceof Tiger) {

                AnimalFileManager.saveAnimal(
                        animal,
                        "data/tiger.txt"
                );

            } else if (animal instanceof Dolphin) {

                AnimalFileManager.saveAnimal(
                        animal,
                        "data/dolphin.txt"
                );

            } else if (animal instanceof Penguin) {

                AnimalFileManager.saveAnimal(
                        animal,
                        "data/penguin.txt"
                );
            }
        }
    }

    /**
     * Loads all animals from their respective files
     * and displays the saved data.
     */
    public static void loadAnimalData() {

        System.out.println();
        System.out.println("===== LOADING ANIMAL DATA =====");

        Animal tiger =
                AnimalFileManager.loadAnimal(
                        "data/tiger.txt"
                );

        Animal dolphin =
                AnimalFileManager.loadAnimal(
                        "data/dolphin.txt"
                );

        Animal penguin =
                AnimalFileManager.loadAnimal(
                        "data/penguin.txt"
                );

        System.out.println();
        System.out.println("===== SAVED ANIMAL DATA =====");

        if (tiger != null) {
            System.out.println(tiger);
        }

        if (dolphin != null) {
            System.out.println(dolphin);
        }

        if (penguin != null) {
            System.out.println(penguin);
        }
    }
}

