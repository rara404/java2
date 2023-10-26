public class Person extends Animal {
    private String firstName;
    private String lastName;
    private int ssn;
    private static int count = 0;

    public Person() {
        super();
        this.firstName = null;
        this.lastName = null;
        this.ssn = -1;
        count++;
    }

    public Person(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = -1;
        count++;
    }

    public Person(String firstName, String lastName, byte age, int ssn) {
        super(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        count++;
    }

    public String speak(){
        if(this.firstName == null){
            return "I don't have a name.";
        } else if(this.age == -1){
            return "My name is " + this.firstName + " " + this.lastName;
        } else {
            return "My name is " + this.firstName + " " + this.lastName + " and I am " + this.age + " years old.";
        }
    }

    public static int getPersonCount(){
        return count;
    }

    @Override
    public String toString() {
        if(this.firstName == null){
            return "N/A";
        } else if(this.age == -1){
            return  this.firstName + " " + this.lastName;
        } else {
            return this.firstName + " " + this.lastName + " " + (this.ssn % 10000);
        }
    }
}
