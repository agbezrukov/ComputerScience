package src.function.homework;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * Протестировать функцию в main.
 */
public class Task1 {
    public static void main(String[] args) {

        int minutes = 51;
        isQuarterHour(minutes);
    }

    public static void isQuarterHour(int value) {

        if (value >= 0 && value <= 14) {
            System.out.println("first quarter hour");
        } else if (value >= 15 && value <= 29) {
            System.out.println("second quarter hour");
        } else if (value >= 30 && value <= 44) {
            System.out.println("third quarter hour");
        } else if (value >= 45 && value <= 59) {
            System.out.println("fourth quarter hour");
        } else {
            System.out.println("minutes are incorrect");
        }
    }
}
