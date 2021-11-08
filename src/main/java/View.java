import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);
    public int AskForInteger() {
        System.out.println("What whole number integer would you like to convert to roman numerals?");
        return Integer.parseInt(scanner.nextLine());
    }
    public void printRomanNumeral(String romanNumeral, int number) {
        System.out.println("The integer of " + number + " converts to roman numerals of: " );
        System.out.println(romanNumeral);
    }
}
