import java.util.Scanner;
public class Reversenumber {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = scanner.nextInt();
        int reversedNum = 0;
        
        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Append digit to reversed number
            num /= 10; // Remove the last digit from num
        }

        System.out.println("Reversed Number: " + reversedNum);
    }
}
