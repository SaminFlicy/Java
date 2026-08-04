import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6, 3};
        System.out.println("Original array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
