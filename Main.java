import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // === User Registration ===
            System.out.println("=== User Registration ===");
            System.out.print("Enter your first name: ");
            String firstName = input.nextLine();

            System.out.print("Enter your last name: ");
            String lastName = input.nextLine();

            Login login = new Login(firstName, lastName);

            System.out.print("Enter a username: ");
            String username = input.nextLine();

            System.out.print("Enter a password: ");
            String password = input.nextLine();

            System.out.print("Enter your South African cell phone number (with + country code): ");
            String cellPhone = input.nextLine();

            String registrationResult = login.registerUser(username, password, cellPhone);
            System.out.println(registrationResult);

            if (!registrationResult.equals("User registered successfully!")) {
                System.out.println("❌ Registration failed. Please restart the program.");
                return;
            }

            // === Login ===
            System.out.println("\n=== Login ===");
            System.out.print("Enter your username: ");
            String loginUsername = input.nextLine();

            System.out.print("Enter your password: ");
            String loginPassword = input.nextLine();

            String loginStatus = login.returnLoginStatus(loginUsername, loginPassword);
            System.out.println(loginStatus);

            if (!login.loginUser(loginUsername, loginPassword)) {
                System.out.println("❌ Exiting program. Please try again later.");
                return;
            }
        }

        // ✅ Hand off to ChatApp (make sure ChatApp.java exists in same folder)
        ChatApp chatApp = new ChatApp();
        chatApp.start();
    }
}