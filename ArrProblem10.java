import java.util.Arrays;
import java.util.Scanner;

public class ArrProblem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array = new int[10];
        
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}