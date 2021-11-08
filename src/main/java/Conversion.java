public class Conversion {
    public StringBuilder ConvertIntToRoman(int input) {
        int[] arrayOfNumbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] arrayOfRomans = {"M", "CM", "D", "CD", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder convertedRoman = new StringBuilder();
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            while (input >= arrayOfNumbers[i]) {
                input -= arrayOfNumbers[i];
                convertedRoman.append(arrayOfRomans[i]);
            }
        }
        return convertedRoman;
    }
}
