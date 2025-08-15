import java.util.Arrays;
public class ArrProblem08{
    public static void main(String[] args) {
        
        int[] Array = {1, 2, 3, 4, 5};
        int[] NArray = new int[Array.length];
        for (int i = 0; i < Array.length; i++) {
            NArray[i] = Array[i];
        }
        
        System.out.print("Original Array: ");
        for (int i : Array) {
            System.out.print(i + " ");
        }
        
        System.out.print("\nCopied Array: ");
        System.out.print(Arrays.toString(NArray));
    }
}