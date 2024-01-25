public class Person implements Payable {
    private static int nextId = 1;
    private int id;
    private String name;
    private String surename;
    public Person(){
        this.id = nextId++;
    }
    public Person(String surname, String name){
        this();
        this.name = name;
        this.surename = surname;
    }
    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name=name;
    }
    public String getSurename(){
        return surename;
    }
    public void setSurename(String surename){
        this.surename = surename;
    }
    @Override
    public String toString(){
        return id +") "+surename+" "+name;
    }
    @Override
    public double getPayment() {
        return 0.0;
    }
    public String getPosition(){
        return "Student";
    }
}
