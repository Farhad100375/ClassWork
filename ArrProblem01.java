import java.util.Arrays;

public class ArrProblem01{
    public static void main(String[] args) {
        int[] NArray = {5, 2, 9, 1, 5, 6};
        System.out.println("Original numeric array: " + Arrays.toString(NArray));
        
        Arrays.sort(NArray);
        System.out.println("Sorted numeric array: " + Arrays.toString(NArray));
        
        String[] SArray = {"banana", "apple", "pear", "orange", "grape"};
        System.out.println("Original string array: " + Arrays.toString(SArray));
        
        Arrays.sort(SArray);
        System.out.println("Sorted string array: " + Arrays.toString(SArray));
    }
}