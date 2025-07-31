 // Superclass
class Animal {
    // Constructor of superclass
    public Animal() {
        System.out.println("Animal created.");
    }

    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound.");
    }

    // Superclass method
    public void info() {
        System.out.println("This is an animal.");
    }
}

// Subclass
class Dog extends Animal {
    // Constructor of subclass
    public Dog() {
        // Calling superclass constructor
        super();
        System.out.println("Dog created.");
    }

    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }

    // Accessing superclass method
    public void showInfo() {
        info(); // Calls superclass method
    }
}

// Main class to test the inheritance
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Create a Dog object
        
        // Call overridden method
        dog.sound();

        // Access superclass method
        dog.showInfo();
    }
}
