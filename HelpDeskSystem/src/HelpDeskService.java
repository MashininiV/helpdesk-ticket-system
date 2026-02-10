import java.util.ArrayList;

public class HelpDeskService {

    private ArrayList<Ticket> tickets;
    private int ticketCounter;

    public HelpDeskService() {
        tickets = new ArrayList<>();
        ticketCounter = 1;
    }
    public void createTicket (String description, String Priority) {
       Ticket ticket = new Ticket(ticketCounter, description, Priority);
       tickets.add(ticket);
       System.out.println("Ticket created successfully with ID: " + ticketCounter);
       ticketCounter++;
    }
    public void viewTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets available.");
            return;
        }
        for (Ticket ticket : tickets){
            System.out.println(ticket);
        }
    }
    public void updateTicketStatus(int id, String status){
        for (Ticket ticket : tickets){
            if (ticket.getId() == id) {
                ticket.setStatus(status);
                System.out.println("Ticket status updated");
                return;
            }
        }
        System.out.println("Ticket not found.");
    }
}