import java.io.Serializable;

/**
 * Represents a penguin in the zoo.
 *
 * Penguin extends Animal and implements Eat
 * and Serializable.
 */
public class Penguin extends Animal implements Eat, Serializable {

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
     * Returns a readable representation of the penguin.
     */
    @Override
    public String toString() {
        return "Penguin{name='" + getName()
                + "', age=" + getAge() + "}";
    }
}

