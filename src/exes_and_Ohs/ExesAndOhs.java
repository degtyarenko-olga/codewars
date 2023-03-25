package exes_and_Ohs;

/**
 * Check to see if a string has the same amount of 'x's and 'o's.
 * The method must return a boolean and be case insensitive.
 * The string can contain any char.
 *
 * @author Degtyarenko Olga
 * @since 25.03.2023
 */
public class ExesAndOhs {
    public static boolean getXO(String str) {

        str = str.toLowerCase(); // приведение к нижнему регистру
        int countX = 0, countO = 0;

        // перебираем символы в строке и подсчитываем количество символов "x" и "o"
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'x') {
                countX++;
            } else if (c == 'o') {
                countO++;
            }
        }

        return countX == countO; // возвращаем результат сравнения количества символов "x" и "o"

    }

}
