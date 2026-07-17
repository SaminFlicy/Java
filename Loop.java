import java.util.*;
public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Please enter another number: ");
        int num2 = sc.nextInt();
        System.out.println("The numbers you entered are: " + num1 + " and " + num2);
        if (num1 < num2) {
           
         for(int i = num1; i <= num2; i++) {
            System.out.println(i);
         }
        }
        else if (num1 > num2) {
            for(int i = num1; i >= num2; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println("The numbers are equal.");
        }
    }
}
