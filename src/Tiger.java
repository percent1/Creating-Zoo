/**
 * Represents a tiger in the zoo.
 *
 * Tiger extends the Animal class and implements
 * the Eat interface.
 */
public class Tiger extends Animal implements Eat {

    /**
     * Creates a new Tiger.
     *
     * @param name the name of the tiger
     * @param age the age of the tiger
     */
    public Tiger(String name, int age) {
        // Call the constructor of the Animal parent class.
        super(name, age);
    }

    /**
     * Makes the sound of a tiger.
     */
    @Override
    public void makeSound() {
        System.out.println("The tiger roars: Roar!");
    }

    /**
     * Defines what the tiger eats.
     */
    @Override
    public void eat() {
        System.out.println("The tiger eats meat.");
    }
}