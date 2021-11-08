import java.util.LinkedList;

public class Conversion {
    public LinkedList<Integer> ConvertToMultipleDigits(int number) {
        LinkedList<Integer> individualDigits = new LinkedList<>();
        while (number > 0) {
            individualDigits.push(number % 10);
            number = number / 10;
        }
        return individualDigits;
    }
}
