import java.util.*;

public class ArrProblem07{
    public static void main(String[] args) {
        Integer[] Array = {10, 20, 30, 40, 50};
        Scanner input = new Scanner(System.in);
        System.out.println("Original array: " + Arrays.toString(Array));
        System.out.print("Enter the element to remove: ");
        int Remove = input.nextInt();
        int n=Array.length;
        for(int i=0; i<n; i++)
        {
            if(Remove == Array[i])
            {
                for(int j=i; j<n-1; j++)
                {
                    Array[j]=Array[j+1];
                }
                Array[n-1] = null;
                n--;
                i--;
            }
        }
        System.out.println("Array after removal: " + Arrays.toString(Array));
    }
}