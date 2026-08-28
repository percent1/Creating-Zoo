/**
 * Represents a penguin in the zoo.
 *
 * Penguin extends the Animal class and implements
 * the Eat interface.
 */
public class Penguin extends Animal implements Eat {

    /**
     * Creates a new Penguin.
     *
     * @param name the name of the penguin
     * @param age the age of the penguin
     */
    public Penguin(String name, int age) {
        // Call the constructor of the Animal parent class.
        super(name, age);
    }

    /**
     * Makes the sound of a penguin.
     */
    @Override
    public void makeSound() {
        System.out.println("The penguin squawks: Squawk!");
    }

    /**
     * Defines what the penguin eats.
     */
    @Override
    public void eat() {
        System.out.println("The penguin eats fish.");
    }
}