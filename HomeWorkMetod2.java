/**
 * GU_QA_1524 (08.06.2021)
 * Java 1. Homework #2
 *
 * @author Nurgalina Lyaysan
 * @version 12.12.2021
 *
 */

public class HomeWorkMetod2 {
    public static void main(String[]args) {
        System.out.println(within10and20(3, -4));
        System.out.println(within10and20(11, 5));
        System.out.println(within10and20(18, 20));

        isPositiveOrNegative(-25);
        isPositiveOrNegative(0);
        isPositiveOrNegative(35);

        System.out.println(isNegative(-15));
        System.out.println(isNegative(0));
        System.out.println(isNegative(22));

        printWordNTimes("Java", 4);
    }

    static boolean within10and20(int x, int y) {
        return x + y >= 10 && x + y <= 20;
    }

    static void isPositiveOrNegative(int x) {
        System.out.println(x >= 0 ? "Sum is positive" : "Sum is negative");
    }

    static boolean isNegative(int x) {
        return x < 0;
    }

    static void printWordNTimes(String word, int times) {
        for (int j = 0; j < times; j++) {
            System.out.println(word);
        }
    }
}
