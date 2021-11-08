public class Main {
    public static void main(String[] args) {
        View view = new View();
        int number;
        number = view.AskForInteger();
        view.printRomanNumeral("", number);
    }
}
