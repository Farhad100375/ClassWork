import java.util.*;
public class ArrProblem06{
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value to search for: ");
        int target = input.nextInt();
        for (int i=0;i<numbers.length; i++) {
            if (numbers[i] == target) 
            {
                i++;
                System.out.println("Array: " + Arrays.toString(numbers));
                System.out.println("The array contains the value " + target+ " in " +i+" no. index");
                break;
            }
        }
    }
}