import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Continuously display menu and handle user's choice
        while (true) {
            // Display menu
            displayMenu();
            
            // Get user's choice
            choice = scanner.nextInt();
            
            // Handle user's choice
            if (!handleMenuChoice(choice)) {
                break; // Exit the loop if the choice was 3 (exit)
            }
        }
        
        // Close the scanner
        scanner.close();
    }

    // Method to display the menu options
    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
    }

    // Method to handle user's menu choice and call corresponding methods
    public static boolean handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd();
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                return false; // Exit the program
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                break;
        }
        return true; // Continue the loop if the choice was valid but not exit
    }

    // Helper method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Helper method to check if a number is even or odd
    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd using the modulo operator
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}
