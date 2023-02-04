package src.cycles.practicalTask;

/**
 * Написать программу, которая проходит циклом по английскому
 * алфавиту, начиная с буквы ‘b’, и выводит каждую букву до тех пор,
 * пока не встретит гласную (т.е. вывести согласные на консоль).
 */
public class Task5 {
    public static void main(String[] args) {

        char startChar = 'b';
        printLetters(startChar);

    }

    public static void printLetters(char startChar) {

        for (char currentChar = startChar; !isVowel(currentChar); currentChar++) {
            System.out.println(currentChar);
        }
    }

    public static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'y' || letter == 'o' || letter == 'i';
    }
}
