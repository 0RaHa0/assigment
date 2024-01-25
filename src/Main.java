import java.util.ArrayList;
import java.util.Collections;
public class Main {
 public static void main(String[] args){
  Employee employee1 = new Employee("John", "Lennon", "Manager", 50000.00);
  Employee employee2 = new Employee("George", "Harrison", "Developer", 60000.00);
  Student student1 = new Student("Paul", "McCartney", 3.5);
  Student student2 = new Student("Ringo", "Starr", 2.0);

  ArrayList<Person> people = new ArrayList<>();
  people.add(employee1);
  people.add(employee2);
  people.add(student1);
  people.add(student2);

  Collections.sort(people);

  printData(people);
 }
 public static void printData(Iterable<Person> people) {
  for (Person person : people) {
   System.out.println(person.getPosition() + ": " + person.toString() + " earns " + person.getPayment() + " tenge");
  }
 }

 }