public class Employee extends Person {
    private String position;
    private double salary;

    // Default constructor
    public Employee() {
        super(); // Call the default constructor of the superclass (Person)
    }

    // Parameterized constructor
    public Employee(String name, String surname, String position, double salary) {
        super(surname, name); // Call the parameterized constructor of the superclass (Person)
        this.position = position;
        this.salary = salary;
    }

    // Getter for the position field
    public String getPosition() {
        return position;
    }

    // Setter for the position field
    public void setPosition(String position) {
        this.position = position;
    }

    // Getter for the salary field
    public double getSalary() {
        return salary;
    }

    // Setter for the salary field
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override the toString method to provide a custom string representation
    @Override
    public String toString() {
        return "Employee: " + super.toString(); // Include the superclass's toString in the output
    }

    // Implementation of the getPaymentAmount method from the Payable interface
    public double getPaymentAmount() {
        return salary; // Return the salary as the payment amount
    }

    // Implementation of the compareTo method for sorting based on salary
    @Override
    public int compareTo(Person other) {
        if (other instanceof Employee) {
            return Double.compare(this.salary, ((Employee) other).salary);
        }
        return super.compareTo(other); // Call the compareTo method of the superclass (Person)
    }
}
