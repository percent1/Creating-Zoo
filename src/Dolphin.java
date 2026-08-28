/**
 * Represents a dolphin in the zoo.
 *
 * Dolphin extends the Animal class and implements
 * the Eat interface.
 */
public class Dolphin extends Animal implements Eat {

    /**
     * Creates a new Dolphin.
     *
     * @param name the name of the dolphin
     * @param age the age of the dolphin
     */
    public Dolphin(String name, int age) {
        // Call the constructor of the Animal parent class.
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
}