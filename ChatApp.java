import java.util.Scanner;

public class ChatApp {

    public void start() {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        System.out.println("\n=== Welcome to QuickChat ===");

        while (running) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1) Send Messages");
            System.out.println("2) Show Recently Sent Messages (Coming Soon)");
            System.out.println("3) Quit");
            System.out.print("Enter choice: ");

            int choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("How many messages do you want to send? ");
                    int numMessages = input.nextInt();
                    input.nextLine(); // consume newline

                    for (int i = 0; i < numMessages; i++) {
                        System.out.print("Enter message " + (i + 1) + ": ");
                        String message = input.nextLine();
                        System.out.println("📩 Message sent: " + message);
                    }
                    break;

                case 2:
                    System.out.println("🚧 Coming Soon.");
                    break;

                case 3:
                    System.out.println("👋 Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("❌ Invalid choice, try again.");
            }
        }
    }
}