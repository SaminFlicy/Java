import java.util.Scanner;

public class Leapyearchecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("  it is a leap year.");
        } else {
            System.out.println("  it is not a leap year.");
        }

        input.close();
    }
}