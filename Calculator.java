import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number A:");
        int A = scanner.nextInt();
        System.out.println("Enter number B:");
        int B = scanner.nextInt();

        int Sum = A + B;
        System.out.println("The sum of A & B is:"+Sum);

        int Substraction = A - B;
        System.out.println("The substraction of A & B is:"+Substraction);

        int Multiplication = A * B;
        System.out.println("The multiplication of A & B is:"+Multiplication);

        int Division = A/B;
        System.out.println("The division of A & B is:"+Division);

        int Modulus =  A % B;
        System.out.println("The modulus of A % B is:"+Modulus);

        float SquareA = A * A;
        float SquareB = B * B;
        System.out.println("The square of A is:"+SquareA);
        System.out.println("The square of B is:"+SquareB);
        scanner.close();
    }
}