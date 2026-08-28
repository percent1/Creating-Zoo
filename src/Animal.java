import java.io.Serializable;

/**
 * Represents the base class for all animals in the zoo.
 *
 * Animal is an abstract class and provides common
 * properties shared by all animals.
 *
 * The class implements Serializable so that animal
 * objects can be saved to files.
 */
public abstract class Animal implements Serializable {

    /**
     * Required for serialization.
     */
    private static final long serialVersionUID = 1L;

    // Stores the animal's name.
    private String name;

    // Stores the animal's age.
    private int age;

    /**
     * Creates a new Animal.
     *
     * @param name the name of the animal
     * @param age the age of the animal
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Returns the animal's name.
     *
     * @return the animal's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the animal's age.
     *
     * @return the animal's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Makes a sound specific to the animal.
     *
     * Each animal subclass must provide its own
     * implementation.
     */
    public abstract void makeSound();
}

