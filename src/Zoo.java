/**
 * Main class for the Creating Zoo application.
 *
 * This class creates different animals and demonstrates
 * inheritance, interfaces, and polymorphism.
 */
public class Zoo {

    /**
     * The main method starts the Zoo application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create a Tiger object.
        Animal tiger = new Tiger("Simba", 5);

        // Create a Dolphin object.
        Animal dolphin = new Dolphin("Flipper", 3);

        // Create a Penguin object.
        Animal penguin = new Penguin("Pingu", 2);

        // Display the tiger's information.
        System.out.println("=== Tiger ===");
        System.out.println("Name: " + tiger.getName());
        System.out.println("Age: " + tiger.getAge());
        tiger.makeSound();

        // Display the dolphin's information.
        System.out.println("\n=== Dolphin ===");
        System.out.println("Name: " + dolphin.getName());
        System.out.println("Age: " + dolphin.getAge());
        dolphin.makeSound();

        // Display the penguin's information.
        System.out.println("\n=== Penguin ===");
        System.out.println("Name: " + penguin.getName());
        System.out.println("Age: " + penguin.getAge());
        penguin.makeSound();
    }
}