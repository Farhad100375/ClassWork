import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int i = (a < b) ? a : b;
        while (i > 0) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("GCD = " + i);
                break;
                }
            
            i--; 
        }
    }
}
