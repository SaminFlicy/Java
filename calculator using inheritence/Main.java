import java.util.Scanner;

//parent
class Calculator {
    
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }
}

// Child
class child extends Calculator {

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        child calc = new child();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                result = calc.add(num1, num2);
                break;

            case 2:
                result = calc.subtract(num1, num2);
                break;

            case 3:
                result = calc.multiply(num1, num2);
                break;

            case 4:
                if (num2 != 0) {
                    result = calc.divide(num1, num2);
                } else {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("Result = " + result);

        sc.close();
    }
}