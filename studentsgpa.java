import java.util.*;
import java.util.Scanner;
import java.lang.*
class Student {
    private String USN;
    private String name;
    private int n;
    private double SGPA = 0;
    private int totalCredits = 0;
    Scanner sc = new Scanner(System.in);

    void Details() {
        System.out.println("Enter USN of the student");
        USN = sc.nextLine();
        System.out.println("Enter the name of the student");
        name = sc.nextLine();
        System.out.println("Enter the number of subjects");
        n = sc.nextInt();
        int[] credits = new int[n];
        double[] marks = new double[n];
        System.out.println("Enter the details of the subjects:");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter credits allotted to the subject " + (i + 1));
            credits[i] = sc.nextInt();
            System.out.println("Enter marks in the subject" + (i + 1));
            marks[i] = sc.nextInt();
            Calculate(credits[i], marks[i], i);
        }
    }

    void Calculate(int credit, double marks, int j) {
        totalCredits = totalCredits + credit;
        if (marks >= 90 && marks <= 100)
            SGPA = SGPA + (10 * credit);
        else if (marks >= 80 && marks <= 89)
            SGPA = SGPA + (9 * credit);
        else if (marks >= 70 && marks <= 79)
            SGPA = SGPA + (8 * credit);
        else if (marks >= 60 && marks <= 69)
            SGPA = SGPA + (7 * credit);
        else if (marks >= 50 && marks <= 59)
            SGPA = SGPA + (6 * credit);
        else if (marks >= 40 && marks <= 49)
            SGPA = SGPA + (5 * credit);
        else
            System.out.println("Failed in the subject" + (j + 1));
    }

    void Display() {
        System.out.println("Details of the student is:");
        System.out.println("Name:" + name);
        System.out.println("USN:" + USN);
        System.out.println("SGPA of the student " + (SGPA / totalCredits));
    }
}

class studentsgpa{
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.Details();
        s1.Display();
    }
}
