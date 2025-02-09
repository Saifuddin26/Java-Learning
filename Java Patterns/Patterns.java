import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        System.out.println("PATTERN SOLID RECTANGLE");
        int a = 4;
        int b = 5;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("PATTERN HOLLOW RECTANGLE");
        int c = 4;
        int d = 5;

        for (int i = 1; i <= c; i++) {

            for (int j = 1; j <= d; j++) {
                if (i == 1 || j == 1 || i == c | j == d) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("PATTERN HALF PYRAMID");
        int e = 4;
        for (int i = 1; i <= e; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("PATTERN INVERT HALF PYRAMID");
        int f = 4;
        for (int i = f; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');

            System.out.println();

        }
        

        System.out.println("PATTERN HALF PYRAMID AFTER 180 DEGREE ROTATION");
        int g = 4;
        for (int i = 1; i <= g; i++) {
            for (int j = 1; j <= g; j++) {
                if (j <= g - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("Number Pyramid");
        int h = 4;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }

    }
}
