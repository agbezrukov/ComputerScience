package src.lesson18;

public class Task1 {

    public static void main(String[] args) {

        int value1 = 330;
        int value2 = 50;

        int resultIf = getMaxIf(value1, value2);
        System.out.println("resultIf: " + resultIf);
        int resultTernary = getMaxTernary(value1, value2);
        System.out.println("resultTernary: " + resultTernary);
        int resultMath = getMaxMath(value1, value2);
        System.out.println("resultMath: " + resultMath);
    }

    public static int getMaxIf(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public static int getMaxTernary(int first, int second) {
        return first > second ? first : second;
    }

    public static int getMaxMath(int first, int second) {
        return Math.max(first, second);
    }
}
