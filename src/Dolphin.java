import java.io.Serializable;

/**
 * Represents a dolphin in the zoo.
 *
 * Dolphin extends Animal and implements Eat
 * and Serializable.
 */
public class Dolphin extends Animal implements Eat, Serializable {

    /**
     * Required for serialization.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Creates a new Dolphin.
     *
     * @param name the name of the dolphin
     * @param age the age of the dolphin
     */
    public Dolphin(String name, int age) {
        super(name, age);
    }

    /**
     * Makes the sound of a dolphin.
     */
    @Override
    public void makeSound() {
        System.out.println("The dolphin clicks: Click click!");
    }

    /**
     * Defines what the dolphin eats.
     */
    @Override
    public void eat() {
        System.out.println("The dolphin eats fish.");
    }

    /**
     * Returns a readable representation of the dolphin.
     */
    @Override
    public String toString() {
        return "Dolphin{name='" + getName()
                + "', age=" + getAge() + "}";
    }
}

