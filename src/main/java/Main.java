public class Main {
    public static void main(String[] args) {
        View view = new View();
        Conversion conversion = new Conversion();
        int number;
        number = view.AskForInteger();
        StringBuilder romanNumeral = conversion.ConvertIntToRoman(number);
        view.printRomanNumeral(romanNumeral, number);
    }
}
