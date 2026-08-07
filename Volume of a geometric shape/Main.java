import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of a geometric shape: ");
        double size = sc.nextDouble();
        double volume = (4.0/3.0) * Math.PI * Math.pow(size, 3);
        System.out.println("The volume of the geometric shape is: " + volume);
        sc.close();


    }
}
