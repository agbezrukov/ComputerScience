package src.Lesson16;

/**
 * Имеется целое число. Это число - сумма денег в рублях.
 * Вывести это число, добавив к нему слово «рубль» в правильном падеже («рубль», «рублей», «рубля»)
 */

public class Task3 {
    public static void main(String[] args) {
        // рубль 1, !11
        // рубля 2 - 4,!12 - 14
        // рублей 0, 5 - 9, 11 - 19

        int ruble = 512;

        int remainder10 = ruble % 10;
        int remainder100 = ruble % 100;

        if(remainder10 == 0 || 5 <= remainder10 && remainder10 <= 9 || 11 <= remainder100 && remainder100 <= 19){
            System.out.println(ruble + " рублей");
        } else if (2 <= remainder10 && remainder10 <= 4) {
            System.out.println(ruble + " рубля");
        } else if (remainder10 == 1) {
            System.out.println(ruble + " рубль");
        } else {
            System.out.println("Не верно введена сумма!");
        }

    }
}
