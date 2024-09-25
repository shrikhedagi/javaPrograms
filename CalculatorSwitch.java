import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of A:");
        int A=scanner.nextInt();
        System.out.println("Enter value of B:");
        int B=scanner.nextInt();
        System.out.println("Enter which operation:");
        int C=scanner.nextInt();
switch (C) {
    case 1:
        int Sum = A + B;
        System.out.println("The sum of A and B is = "+Sum);
        break;

    case 2:
        int Substraction = A - B;
        System.out.println("The substraction of A and B is = "+Substraction);
        break;

    case 3:
        int Multiplication = A * B;
        System.out.println("The multiplication of A and B is = "+Multiplication);
        break;
    
    case 4:
        double Modulus = A % B;
        System.out.println("The modulus of A % B is = "+Modulus);
        break;
    default:
        System.out.println("Invalid choice");
    }
}
}