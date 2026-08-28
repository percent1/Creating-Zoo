
/**
 * Represents a tiger in the zoo.
 *
 * Tiger extends Animal and implements Eat, Walk,
 * and Serializable.
 */public class Tiger extends Animal implements Eat, Walk{
    /**
     * Required for serialization.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Creates a new Tiger.
     *
     * @param name the name of the tiger
     * @param age the age of the tiger
     */
    public Tiger(String name, int age) {
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

    /**
     * Defines how the tiger walks.
     */
    @Override
    public void walk() {
        System.out.println("The tiger walks on four legs.");
    }

    /**
     * Returns a readable representation of the tiger.
     */
    @Override
    public String toString() {
        return "Tiger{name='" + getName()
                + "', age=" + getAge() + "}";
    }
}

