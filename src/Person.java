public class Person implements Payable, Comparable<Person> {
    private static int nextId = 1; // Static variable to manage unique IDs across instances
    private int id; // Unique identifier for each person
    private String name;
    private String surename;

    // Default constructor
    public Person() {
        this.id = nextId++; // Assign a unique ID to each new instance
    }

    // Parameterized constructor
    public Person(String surname, String name) {
        this(); // Call the default constructor to set the unique ID
        this.name = name;
        this.surename = surname;
    }

    // Getter for the ID field
    public int getId() {
        return id;
    }

    // Getter for the name field
    public String getName() {
        return name;
    }

    // Setter for the name field
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the surename field
    public String getSurename() {
        return surename;
    }

    // Setter for the surename field
    public void setSurename(String surename) {
        this.surename = surename;
    }

    // Override the toString method to provide a custom string representation
    @Override
    public String toString() {
        return id + ") " + surename + " " + name;
    }

    // Implementation of the getPayment method from the Payable interface
    @Override
    public double getPayment() {
        return 0.0; // Default payment is zero for a generic person
    }

    // Implementation of the getPosition method from the Payable interface
    @Override
    public String getPosition() {
        return "Student"; // Default position is "Student" for a generic person
    }

    // Implementation of the compareTo method for sorting based on ID
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPayment(), other.getPayment());
    }
}

