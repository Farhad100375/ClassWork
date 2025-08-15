import java.util.*;

public class ArrProblem04{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
        }
        double sum = 0;
        for (double number : numbers) 
        {
            sum += number;
        }
        
        double average = sum / n;
        
        System.out.println("Array elements: " +Arrays.toString(numbers));
        System.out.println("Average value: " + average);
    }
}