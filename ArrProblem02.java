public class ArrProblem02{
    public static void main(String[] args) {
        int[] numbers = {5, 2, 7, 9, 3, 6};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum of the array elements is: " + sum);
    }
}