import java.util.Scanner;
public class ReverseString{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the string to be reversed :");
        String A1 = scanner.nextLine();
        String A2 = reverseString(A1);
        System.out.println("Reversed string: " + A2);
        scanner.close();
    }
    
    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}