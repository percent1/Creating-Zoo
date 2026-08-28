/**
 * Defines eating behavior for animals in the zoo.
 *
 * This interface allows different animal classes to
 * provide their own implementation of the eat() method.
 */
public interface Eat {

    /**
     * Defines how an animal eats.
     *
     * Each class that implements this interface
     * must provide its own implementation.
     */
    void eat();
}