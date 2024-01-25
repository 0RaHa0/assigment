public class Student extends Person {
    private double gpa;

    // Default constructor
    public Student() {
        super(); // Call the default constructor of the superclass (Person)
    }

    // Parameterized constructor
    public Student(String name, String surname, double gpa) {
        super(name, surname); // Call the parameterized constructor of the superclass (Person)
        this.gpa = gpa;
    }

    // Getter for the GPA field
    public double getGpa() {
        return gpa;
    }

    // Setter for the GPA field
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Override the toString method to provide a custom string representation
    @Override
    public String toString() {
        return "Student: " + super.toString(); // Include the superclass's toString in the output
    }

    // Implementation of the getPayment method from the Payable interface
    @Override
    public double getPayment() {
        if (gpa > 2.67) {
            return 36660.00; // Return stipend if GPA is greater than 2.67
        } else {
            return 0.00; // Return zero payment if GPA is 2.67 or lower
        }
    }

    // Implementation of the getPosition method from the Payable interface
    @Override
    public String getPosition() {
        if (gpa > 2.67) {
            return "Student with Stipend"; // Return position with stipend if GPA is greater than 2.67
        } else {
            return super.getPosition(); // Call the getPosition method of the superclass (Person)
        }
    }

    // Implementation of the compareTo method for sorting based on GPA
    @Override
    public int compareTo(Person other) {
        if (other instanceof Student) {
            return Double.compare(this.gpa, ((Student) other).gpa);
        }
        return super.compareTo(other); // Call the compareTo method of the superclass (Person)
    }
}

