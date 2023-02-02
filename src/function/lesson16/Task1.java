package src.function.lesson16;

/**
 * Дан порядковый номер месяца. Вывести на консоль пору года, к которой относится месяц
 */
public class Task1 {

    public static void main(String[] args) {

        int month = 9;

        switch (month) {
            case 12, 1, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("month is incorrect");
        }
    }
}
