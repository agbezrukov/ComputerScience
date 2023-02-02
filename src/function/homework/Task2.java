package src.function.homework;

import java.util.Scanner;

/**
 * Даны 3 переменные:
 * <p>
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * <p>
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 * <p>
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */
public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input fractional number1: ");
        double operand1 = scanner.nextDouble();

        System.out.println("Input fractional number2: ");
        double operand2 = scanner.nextDouble();

        System.out.println("Input fractional operation: ");
        char operation = scanner.next().charAt(0);

        double result = isArithmeticExpression(operand1, operand2, operation);
        System.out.println(result);

    }

    public static double isArithmeticExpression(double value1, double value2, char value3) {

        double result = 0.0;

        switch (value3) {
            case '+' -> {
                return result = value1 + value2;
            }
            case '-' -> {
                return result = value1 - value2;
            }
            case '/' -> {
                return result = value1 / value2;
            }
            case '*' -> {
                return result = value1 * value2;
            }
            case '%' -> {
                return result = value1 + value2;
            }
            default -> {
                return result;
            }
        }
    }
}
