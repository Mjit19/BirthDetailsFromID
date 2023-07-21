import java.util.Scanner;

public class BirthDetailsFromID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Asking for user input
            System.out.print("Enter your ID: ");
            String id = scanner.nextLine();

            // Check if ID is 13 digits long
            if (id.length() != 13) {
                System.out.println("Invalid ID");
                continue;
            } else {
                break;
            }
        }
        
        
        scanner.close();
    }
}