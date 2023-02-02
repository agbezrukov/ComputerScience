package src.function.homework;

import java.util.Scanner;

/**
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * <p>
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше,
 * меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */
public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите катет 'А' первого треугольника: ");
        int a1 = scanner.nextInt();

        System.out.println("Введите катет 'В' первого треугольника: ");
        int b1 = scanner.nextInt();

        System.out.println("Введите катет 'А' второго треугольника: ");
        int a2 = scanner.nextInt();

        System.out.println("Введите катет 'В' второго треугольника: ");
        int b2 = scanner.nextInt();

        isAreaCompareTriangle(a1, b1, a2, b2);
    }

    public static void isAreaCompareTriangle(int a1, int b1, int a2, int b2) {

        double triangleArea1 = isAreaTriangle(a1, b1);
        double triangleArea2 = isAreaTriangle(a2, b2);

        if (0 >= triangleArea1 || 0 >= triangleArea2) {
            System.out.println("Введены не корректные данные");
        } else if (triangleArea1 > triangleArea2) {
            System.out.println("первый треугольник больше второго");
        } else if (triangleArea1 < triangleArea2) {
            System.out.println("первый треугольник меньше второго");
        } else {
            System.out.println("первый треугольник равен второму");
        }
    }

    public static double isAreaTriangle(int a, int b) {
        return (a * b) / 2.0;
    }
}
