public class Ticket {

    private int id;
    private String description;
    private String status;
    private String Priority;

    public Ticket(int id, String description, String Priority){
        this.id = id;
        this.description = description;
        this.Priority = Priority;
        this.status = "Open" ;
    }
    public int getId() {
        return id;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }

    @Override
    public String toString(){
        return "Ticket ID: " + id +
        " | Description: " + description +
        " | Priority: " + Priority +
        " | Status: " + status;
    }
}