import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Asking for user input
            System.out.print("Enter your ID: ");
            String id = scanner.nextLine();
            BirthDetailsFromID details = new BirthDetailsFromID(id);
            details.getDetails();
            int date = details.getDate();
            String month = details.getMonth();
            String year = details.getYear();

            // Check if ID is 13 digits long
            if (!details.checkId()) {
                System.out.println("Invalid ID");
                continue;
            } else {                
                System.out.println("Born on: " + date + " " + month + ", " + year);
                break;
            }
        }
        
        
        scanner.close();
    }
}
