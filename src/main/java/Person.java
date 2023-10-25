public class Person {
    private String firstName;
    private String lastName;
    private byte age;
    private int ssn;
    private static int count = 0;

    public Person() {
        this.firstName = null;
        this.lastName = null;
        this.age = -1;
        this.ssn = -1;
        count++;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = -1;
        this.ssn = -1;
        count++;
    }

    public Person(String firstName, String lastName, byte age, int ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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
