package task.util;

import task.model.TicketModel;

import java.util.List;

public class OutPut {

    public void getInfoStart() {
        System.out.println("Введите введите путь к файлу : ");
    }

    public void getInfoTypeCounting() {
        System.out.println("Введите тип подсчета Moscow or Peter : ");
    }

    public void getInfoRequestContinued() {
        System.out.println("Продолжаем ? Yes(Y) or No(n) :");
    }

    public void getInfoMistakeToInput() {
        System.out.println("Не правильно введен тип подсчета!!");
    }

    public void out(List<TicketModel> ticketModels) {
        for(TicketModel ticket : ticketModels) {
            System.out.println(ticket.getNumberTicket());
        }
    }

    public void getCountTickets(int count) {
        System.out.println("Кол-во счастливых билетов : " + count);
    }


}
