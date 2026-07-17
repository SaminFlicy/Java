import java.util.*;
public class Grade {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your test marks: ");
        int marks = sc.nextInt();
        String grade;

        if (marks >= 93 && marks <= 100) {
            grade = "A";
        } else if (marks >= 87 && marks < 92) {
            grade = "B";
        } else if (marks >= 75 && marks < 86) {
            grade = "C";
        } else if (marks >= 70 && marks < 74) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("The grade is: " + grade);
}
} 



