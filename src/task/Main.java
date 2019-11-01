package task;

import task.controller.TicketController;

public class Main {

    public static void main(String[] args) {
        TicketController ticketController = new TicketController();
        ticketController.run();
    }
}
