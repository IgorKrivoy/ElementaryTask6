package task.model;

public class TicketModel {

    String numberTicket;

    public String getNumberTicket() {
        return numberTicket;
    }

    public TicketModel(String numberTicket) {
        this.numberTicket = numberTicket;
    }

    @Override
    public String toString() {
        return getNumberTicket();
    }
}
