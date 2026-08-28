import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Handles saving and loading animal objects using
 * Java serialization.
 */
public class AnimalFileManager {

    /**
     * Saves an animal object to a file.
     *
     * @param animal the animal to save
     * @param fileName the file where the animal will be saved
     */
    public static void saveAnimal(Animal animal, String fileName) {

        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(
                             new FileOutputStream(fileName))) {

            outputStream.writeObject(animal);

            System.out.println(
                    animal.getClass().getSimpleName()
                    + " saved successfully to "
                    + fileName
            );

        } catch (IOException e) {

            System.out.println(
                    "Error saving animal to "
                    + fileName
                    + ": "
                    + e.getMessage()
            );
        }
    }

    /**
     * Loads an animal object from a file.
     *
     * @param fileName the file containing the saved animal
     * @return the loaded Animal object, or null if loading fails
     */
    public static Animal loadAnimal(String fileName) {

        try (ObjectInputStream inputStream =
                     new ObjectInputStream(
                             new FileInputStream(fileName))) {

            Animal animal = (Animal) inputStream.readObject();

            System.out.println(
                    animal.getClass().getSimpleName()
                    + " loaded successfully from "
                    + fileName
            );

            return animal;

        } catch (IOException | ClassNotFoundException e) {

            System.out.println(
                    "Error loading animal from "
                    + fileName
                    + ": "
                    + e.getMessage()
            );

            return null;
        }
    }
}

