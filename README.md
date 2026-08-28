# 🦁 Creating Zoo — Java OOP & Serialization Project

A Java-based interactive zoo management application demonstrating **object-oriented programming, inheritance, abstract classes, interfaces, polymorphism, exception handling, serialization, and file I/O**.

This project was developed as part of a Java Software Development learning journey and expanded from a basic zoo application into a persistent application capable of saving and loading animal data.

---

## 📖 Project Overview

**Creating Zoo** is a console-based Java application that models a small zoo containing three animals:

* 🐯 Tiger
* 🐬 Dolphin
* 🐧 Penguin

The application allows users to view animals, trigger their behaviors, save their data to files, and load previously saved data.

The project demonstrates how different Java OOP concepts can work together in a single application.

---

## ✨ Features

* Interactive console-based menu
* Animal inheritance using an abstract `Animal` class
* Interfaces for different animal behaviors
* Eating, walking, and swimming behaviors
* Polymorphism through `Animal`, `Eat`, `Walk`, and `Swim`
* Java exception handling for invalid menu input
* `ArrayList` for managing zoo animals
* Object serialization
* Object deserialization
* Individual data files for each animal
* Custom `toString()` implementations
* Persistent animal data
* Git-based incremental development

---

## 🐾 Animal Behaviors

Each animal supports behaviors appropriate to its type.

| Animal     | Eat | Walk | Swim |
| ---------- | :-: | :--: | :--: |
| 🐯 Tiger   |  ✅  |   ✅  |   ❌  |
| 🐬 Dolphin |  ✅  |   ❌  |   ✅  |
| 🐧 Penguin |  ✅  |   ✅  |   ✅  |

This demonstrates how Java interfaces can provide different capabilities to different classes.

For example:

```java
public class Tiger extends Animal implements Eat, Walk
```

while:

```java
public class Dolphin extends Animal implements Eat, Swim
```

and:

```java
public class Penguin extends Animal implements Eat, Walk, Swim
```

---

## 🏗️ Object-Oriented Design

### Abstract Class

The `Animal` class is an abstract base class shared by all animals.

```java
public abstract class Animal implements Serializable
```

It provides common properties such as:

* `name`
* `age`

and defines the abstract:

```java
makeSound()
```

method.

---

### Inheritance

The animal classes inherit from `Animal`:

```text
Animal
├── Tiger
├── Dolphin
└── Penguin
```

This allows common functionality to be defined once in the parent class.

---

### Interfaces

The project uses interfaces to define specific behaviors:

```text
Eat
Walk
Swim
```

Animals only implement the behaviors they support.

For example:

```text
Tiger
 ├── Eat
 └── Walk

Dolphin
 ├── Eat
 └── Swim

Penguin
 ├── Eat
 ├── Walk
 └── Swim
```

This demonstrates **multiple inheritance through interfaces**.

---

### Polymorphism

The application stores all animals in:

```java
ArrayList<Animal> animals
```

This allows different animal objects to be treated as `Animal` objects while still executing their own overridden methods.

For example:

```java
for (Animal animal : animals) {
    animal.makeSound();
}
```

Each animal provides its own implementation of `makeSound()`.

---

## 💾 Serialization & File I/O

The project uses Java serialization to persist animal objects.

The `Animal` class implements:

```java
Serializable
```

The application uses:

```java
ObjectOutputStream
```

to save objects and:

```java
ObjectInputStream
```

to load them.

### Data files

Each animal is stored in its own file:

```text
data/
├── tiger.txt
├── dolphin.txt
└── penguin.txt
```

Although the files use the `.txt` extension, their contents are Java serialized object data rather than ordinary human-readable text.

---

## 🔄 Saving Data

When the user selects:

```text
5. Save Animal Data
```

the application serializes all three animals.

Example:

```text
===== SAVING ANIMAL DATA =====
Tiger saved successfully to data/tiger.txt
Dolphin saved successfully to data/dolphin.txt
Penguin saved successfully to data/penguin.txt
```

---

## 📂 Loading Data

When the user selects:

```text
6. Load Animal Data
```

the application reads the serialized objects from their files.

Example:

```text
===== LOADING ANIMAL DATA =====
Tiger loaded successfully from data/tiger.txt
Dolphin loaded successfully from data/dolphin.txt
Penguin loaded successfully from data/penguin.txt

===== SAVED ANIMAL DATA =====
Tiger{name='Simba', age=5}
Dolphin{name='Flipper', age=3}
Penguin{name='Pingu', age=2}
```

---

## 🖥️ Application Menu

The main menu provides the following options:

```text
================================
          CREATING ZOO
================================
1. View Animals
2. Make Animals Eat
3. Make Animals Walk
4. Make Animals Swim
5. Save Animal Data
6. Load Animal Data
7. Exit
================================
```

### 1. View Animals

Displays each animal's name, age, and sound.

### 2. Make Animals Eat

Makes every animal perform its eating behavior.

### 3. Make Animals Walk

Only animals implementing the `Walk` interface perform the walking behavior.

### 4. Make Animals Swim

Only animals implementing the `Swim` interface perform the swimming behavior.

### 5. Save Animal Data

Serializes the animals and saves them to individual files.

### 6. Load Animal Data

Deserializes the saved objects and displays their data.

### 7. Exit

Closes the application.

---

## 📁 Project Structure

```text
Creating-Zoo/
│
├── src/
│   ├── Animal.java
│   ├── AnimalFileManager.java
│   ├── Dolphin.java
│   ├── Eat.java
│   ├── Penguin.java
│   ├── Swim.java
│   ├── Tiger.java
│   ├── Walk.java
│   └── Zoo.java
│
├── data/
│   ├── dolphin.txt
│   ├── penguin.txt
│   └── tiger.txt
│
├── .gitignore
└── README.md
```

---

## 🛠️ Technologies Used

* **Java**
* **Java 21**
* Object-Oriented Programming
* Java Interfaces
* Abstract Classes
* Collections — `ArrayList`
* Exception Handling
* Java Serialization
* File I/O
* Git
* GitHub
* VS Code / IntelliJ IDEA compatible project structure

---

## ▶️ How to Run

### Prerequisites

Install:

* Java Development Kit (JDK) 21 or later
* Git
* A Java-compatible terminal or IDE

Verify Java:

```powershell
java -version
```

Verify the Java compiler:

```powershell
javac -version
```

---

### Clone the Repository

```powershell
git clone https://github.com/percent1/Creating-Zoo.git
```

Move into the project:

```powershell
cd Creating-Zoo
```

---

### Compile the Project

```powershell
javac src\*.java
```

---

### Run the Application

```powershell
java -cp src Zoo
```

---

## 🧪 Testing

The application was manually tested for:

* Viewing all animals
* Animal sounds
* Eating behavior
* Walking behavior
* Swimming behavior
* Saving animal data
* Loading animal data
* Serialization/deserialization
* Invalid menu input
* Exiting the application

Example walking test:

```text
===== WALKING ANIMALS =====
The tiger walks on four legs.
The penguin waddles on two feet.
```

Example swimming test:

```text
===== SWIMMING ANIMALS =====
The dolphin swims through the water.
The penguin swims through the water.
```

The tests confirm that animals only perform behaviors supported by their interfaces.

---

## 🌿 Git Development History

The project was developed incrementally using Git, with separate commits for major milestones.

```text
Initial Java zoo project
        ↓
Add interactive zoo menu
        ↓
Add validation and exception handling
        ↓
Use ArrayList for zoo animals
        ↓
Add animal serialization support
        ↓
Add animal file persistence
        ↓
Add walking and swimming behaviors
```

Current Git history includes:

```text
ca5a54a Add walking and swimming behaviors
ca38b48 Add animal file persistence
752fd90 Add animal serialization support
7501cb2 Use ArrayList for zoo animals
7eb555c Add validation and exception handling
c45d5e1 Add interactive zoo menu
cf092ed Initial Java zoo project
```

This incremental approach made it easier to test and verify each feature before moving to the next stage.

---

## 🧠 Key Learning Outcomes

This project demonstrates practical understanding of:

### Java OOP

* Classes and objects
* Constructors
* Encapsulation
* Inheritance
* Abstract classes
* Method overriding
* Polymorphism

### Interfaces

* Interface implementation
* Multiple interfaces
* Multiple inheritance through interfaces
* Interface-based behavior

### Collections

* `ArrayList`
* Iterating through collections
* Storing different subclasses using a common parent type

### Exception Handling

* `try-catch`
* `InputMismatchException`
* Handling invalid user input

### File I/O

* `FileInputStream`
* `FileOutputStream`
* `ObjectInputStream`
* `ObjectOutputStream`
* Serialization
* Deserialization

---

## 🚀 Future Improvements

Possible future enhancements include:

* Add more animal species
* Allow users to create animals dynamically
* Allow users to edit animal information
* Add animal deletion functionality
* Validate animal names and ages
* Improve missing-file error messages
* Add automated unit tests
* Replace the console interface with a graphical user interface
* Store animal information in a database
* Add logging
* Improve the file storage format

---

## 👨‍💻 Author

**Percy Ngobeni**

Java Software Development Project

GitHub:

https://github.com/percent1/Creating-Zoo

---

## 📄 License

This project was created for educational and portfolio purposes.
