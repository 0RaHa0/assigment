public class Student extends Person{
    private double gpa;
    public Student(){
        super();
    }
    public Student(String name,String surname, double gpa){
        super(name,surname);
        this.gpa=gpa;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa=gpa;
    }
    @Override
    public String toString(){
        return "Student: "+super.toString();
    }
    @Override
    public double getPayment() {
        if (gpa > 2.67) {
            return 36660.00;
        } else {
            return 0.00;
        }
    }
    @Override
    public String getPosition() {
        if (gpa > 2.67) {
            return "Student with Stipend";
        } else {
            return super.getPosition();
        }
    }
    @Override
    public int compareTo(Person other) {
        if (other instanceof Student) {
            return Double.compare(this.gpa, ((Student) other).gpa);
        }
        return super.compareTo(other);
    }
}
