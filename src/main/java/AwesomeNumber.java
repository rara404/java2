public class AwesomeNumber {
     private int number;

    public AwesomeNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static int add(AwesomeNumber x, AwesomeNumber y) {
        return x.getNumber() + y.getNumber();
    }

    public static int subtract(AwesomeNumber x, AwesomeNumber y) {
        return x.getNumber() - y.getNumber();
    }
}
