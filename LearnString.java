import java.util.Scanner;

public class LearnString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Greetings, I am ChatAssistant. May I know your Name");
        String A = scanner.nextLine();
        System.out.println("Hello, "+A+" ,Nice to talk to you. May I know which country you're from?");
        String B = scanner.nextLine();
        
        if(B.equalsIgnoreCase("India"))
        {
            System.out.println("If so, which State do you belong to?");
            String C = scanner.nextLine();
            System.out.println("That's Nice");
        }

        else {
            System.out.println("We handle clients located in India. Thank you.");
        }
        scanner.close();
    }
}