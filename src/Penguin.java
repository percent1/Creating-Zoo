
import java.io.Serializable;

/**
 * Represents a penguin in the zoo.
 *
 * Penguin extends Animal and implements Eat, Walk,
 * Swim, and Serializable.
 */
public class Penguin extends Animal implements Eat, Walk, Swim, Serializable {

    /**
     * Required for serialization.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Creates a new Penguin.
     *
     * @param name the name of the penguin
     * @param age the age of the penguin
     */
    public Penguin(String name, int age) {
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

    /**
     * Defines how the penguin walks.
     */
    @Override
    public void walk() {
        System.out.println("The penguin waddles on two feet.");
    }

    /**
     * Defines how the penguin swims.
     */
    @Override
    public void swim() {
        System.out.println("The penguin swims through the water.");
    }

    /**
     * Returns a readable representation of the penguin.
     */
    @Override
    public String toString() {
        return "Penguin{name='" + getName()
                + "', age=" + getAge() + "}";
    }
}

