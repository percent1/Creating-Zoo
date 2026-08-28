# Creating Zoo 🦁

A Java object-oriented programming project that demonstrates fundamental and advanced OOP concepts through a simple zoo management application.

## Overview

The Creating Zoo project models different animals in a zoo using Java.

The project demonstrates concepts such as:

* Classes and objects
* Constructors
* Encapsulation
* Inheritance
* Abstract classes
* Interfaces
* Method overriding
* Polymorphism

## Animals

The project currently includes:

* **Tiger** 🐅
* **Dolphin** 🐬
* **Penguin** 🐧

All animals inherit common properties and behaviour from the `Animal` abstract class.

The `Eat` interface defines eating behaviour that animal classes implement.

## Project Structure

```text
Creating Zoo/
│
├── README.md
├── .gitignore
│
└── src/
    ├── Animal.java
    ├── Dolphin.java
    ├── Eat.java
    ├── Penguin.java
    ├── Tiger.java
    └── Zoo.java
```

## Technologies

* Java 21
* Git
* GitHub
* Visual Studio Code

## Running the Project

Compile the Java source files:

```bash
javac src/*.java
```

Run the application:

```bash
java -cp src Zoo
```

## Current Output

The application currently creates a Tiger, Dolphin, and Penguin and displays their names, ages, and sounds.

## Future Improvements

The project will be expanded to include additional zoo functionality, including:

* Interactive menu
* Additional animal behaviour
* User input
* Exception handling
* Improved animal management
* Additional OOP concepts

## Author

**Percy Ngobeni**
