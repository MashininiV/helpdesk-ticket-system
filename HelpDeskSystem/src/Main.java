import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HelpDeskService helpDesk = new HelpDeskService();

        boolean running = true;

        while (running) {
            System.out.println("\n=== Help Desk System ===");
            System.out.println("1. Create Ticket");
            System.out.println("2. View All Tickets");
            System.out.println("3. Update Ticket Status");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter issue description");
                    String description = scanner.nextLine();

                    System.out.print("Enter priority (Low/ Medium/ High:");
                    String Priority =scanner.nextLine();
                    helpDesk.createTicket(description, Priority);
                    break;

                    case 2:
                        helpDesk.viewTickets();
                        break;

                        case 3:
                            System.out.print("Enter Ticket ID: ");
                            int id = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Enter new status (Open/ in Progress/ Resolved): ");
                            String status = scanner.nextLine();

                            helpDesk.updateTicketStatus (id, status);
                            break;

                            case 4:
                                running = false;
                                System.out.println("Exiting system...");
                                break;

                                default:
                                    System.out.println("Invalid Option. Try again.");

            }
        }
        scanner.close();
    }
}