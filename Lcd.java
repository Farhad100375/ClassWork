import java.util.Scanner;

public class Lcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int i = (a > b) ? a : b;
        while (i > 0) {
            if (i % a == 0 && i % b == 0) {
                System.out.println("GCD = " + i);
                break;
            }
            i++;
        }
    }
}