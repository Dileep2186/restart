import java.util.Scanner; // Import the Scanner class for user input

public class Main {
    public static void main(String[] args) {
        // 1. Basic Output
        System.out.println("Welcome to Java Programming!");

        // 2. Variables and Data Types
        int maxAttempts = 3;
        String message = "Your input is: ";

        // 3. User Input using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Hello, " + name + "! Let's run a quick loop.");
