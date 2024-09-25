import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = scanner.nextInt();

        System.out.println("Factorial of " + n + " is: " + factorial(n));  

        scanner.close();
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}