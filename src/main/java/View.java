import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);
    public int AskForInteger() {
        while(true) {
            int input;
            System.out.println("What whole number integer between 1-3000 " +
                    "would you like to convert to roman numerals?");
            input = Integer.parseInt(scanner.nextLine());
            if (input >= 1 && input <= 3000) {
                return input;
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }

    public void printRomanNumeral(String romanNumeral, int number) {
        System.out.println("The integer of " + number + " converts to roman numerals of: " );
        System.out.println(romanNumeral);
    }
}
