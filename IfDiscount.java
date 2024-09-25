import java.util.Scanner;

public class IfDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Discount = 0.0;
        
        System.out.println("Enter the cart value = ");
        double CartValue = scanner.nextDouble();
        System.out.println("Kindly wait, Your Discount is being Caluclated");

        if (CartValue>100) {
            Discount = CartValue * 0.90;
            System.out.println("Your Discounted Price is = "+Discount);
        }
        else
        {
            System.out.println("Your cart value is below 100, purchase cartvalue of above 100 to avail 10% discount");
        }
    }
    
}
