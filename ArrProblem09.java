import java.util.*;
class ArrProblem09{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = new int[11];
        System.out.println("Enter ten values:");
        for(int i =0; i<10; i++)
        {
            array[i]= input.nextInt();
        }
        System.out.println("Enter the index, where do you want to insert: ");
        int Target= input.nextInt();
        System.out.println("Enter the Element, What do you want to insert: ");
        int Element= input.nextInt();
        
        for(int j = 10; j > Target; j--) 
        {
            array[j] = array[j - 1];
        }
        
        array[Target] = Element;
        
        System.out.println(Arrays.toString(array));
    }
}