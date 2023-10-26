public abstract class Animal {
    protected byte age;

    public Animal() {
        this.age = -1;
    }

    public Animal(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return age;
    }
}