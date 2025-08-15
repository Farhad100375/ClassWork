import java.util.*;
public class ArrProblem05{
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30};
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value to search for: ");
        int target = input.nextInt();
        boolean found = false;
        for (int i : numbers) {
            if (i == target) 
            {
                found = true;
                break;
            }
        }
        System.out.println("Array: " + Arrays.toString(numbers));
        if (found) 
        {
            System.out.println("The array contains the value " + target);
        } 
        else 
        {
            System.out.println("The array does not contain the value " + target);
        }
    }
}