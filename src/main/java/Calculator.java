import java.util.ArrayList;

public class Calculator implements Calculatable{

    static ArrayList<String> history = new ArrayList<>();

    public Integer add(Integer number1, Integer number2) {
        int result = number1 + number2;
        history.add(number1 + " + " + number2 + " = " + result);
        return result;

    }

    public Integer subtract(Integer number1, Integer number2) {
        int result = number1 - number2;
        history.add(number1 + " - " + number2 + " = " + result);
        return result;
    }

    public Integer multiply(Integer number1, Integer number2) {
        int result = number1 * number2;
        history.add(number1 + " * " + number2 + " = " + result);
        return result;
    }

    public Integer divide(Integer number1, Integer number2) {
        int result = number1 / number2;
        history.add(number1 + " / " + number2 + " = " + result);
        return result;
    }

    public String getHistory() {
        return history.toString();
    }
}
