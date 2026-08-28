
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
                        makeAnimalsWalk(animals);
                        break;

                    case 4:
                        makeAnimalsSwim(animals);
                        break;

                    case 5:
                        saveAnimalData(animals);
                        break;

                    case 6:
                        loadAnimalData();
                        break;

                    case 7:
                        System.out.println();
                        System.out.println(
                                "Thank you for visiting Creating Zoo!"
                        );
                        break;

                    default:
                        System.out.println();
                        System.out.println(
                                "Invalid option. Please choose 1 to 7."
                        );
                }

            } catch (InputMismatchException e) {

                System.out.println();
                System.out.println(
                        "Invalid input. Please enter a number."
                );

                scanner.nextLine();

                choice = 0;
            }

        } while (choice != 7);

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
        System.out.println("3. Make Animals Walk");
        System.out.println("4. Make Animals Swim");
        System.out.println("5. Save Animal Data");
        System.out.println("6. Load Animal Data");
        System.out.println("7. Exit");
        System.out.println("================================");
    }

    /**
     * Displays information about all animals.
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
     * Makes each animal eat.
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
     * Makes animals that can walk perform their walking behavior.
     *
     * @param animals list containing the zoo animals
     */
    public static void makeAnimalsWalk(ArrayList<Animal> animals) {

        System.out.println();
        System.out.println("===== WALKING ANIMALS =====");

        for (Animal animal : animals) {

            if (animal instanceof Walk) {

                Walk walkingAnimal = (Walk) animal;
                walkingAnimal.walk();
            }
        }
    }

    /**
     * Makes animals that can swim perform their swimming behavior.
     *
     * @param animals list containing the zoo animals
     */
    public static void makeAnimalsSwim(ArrayList<Animal> animals) {

        System.out.println();
        System.out.println("===== SWIMMING ANIMALS =====");

        for (Animal animal : animals) {

            if (animal instanceof Swim) {

                Swim swimmingAnimal = (Swim) animal;
                swimmingAnimal.swim();
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

