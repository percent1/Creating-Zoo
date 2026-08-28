/**
 * Represents the base class for all animals in the zoo.
 *
 * This is an abstract class, which means it cannot be
 * instantiated directly. Specific animal classes such as
 * Tiger, Dolphin, and Penguin will extend this class.
 */
public abstract class Animal {
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
     * implementation of this method.
     */
    public abstract void makeSound();
}