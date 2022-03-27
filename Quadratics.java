import java.lang.*;
import java.util.Scanner;
import java.util.*;

public class Quadratics{
    public static void main(String args[]) {
        System.out.println("Enter the values of a, b and c :");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = (b * b) - (4 * a * c);

        if (d == 0) {
            double r1 = -b / (2 * a);
            double r2 = r1;
            System.out.println("The roots are " + r1 + " and " + r2);
            System.out.println("Roots are real and equal");
        } else if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
            System.out.println("Roots are real and distinct");
        } else {
            double r1 = -b / (2 * a);
            double r2 = (Math.sqrt(-d)) / (2 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
            System.out.println("Roots are imaginary");
        }
    }
}
