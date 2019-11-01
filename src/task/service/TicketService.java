package task.service;

import task.model.TicketModel;

import java.util.ArrayList;
import java.util.List;

public class TicketService {

    List<Integer> listNumbers = new ArrayList<>();

    public List<Integer> splitToIntegerArray(String num) {
        listNumbers.clear();
        int number = Integer.parseInt(num);
        while (number != 0) {
            listNumbers.add(number % 10);
            number /= 10;
        }
        return listNumbers;
    }

    public int countingMethodMoscow(List<TicketModel> ticketModels) {

        int count = 0;
        for (TicketModel ticketModel : ticketModels) {
            splitToIntegerArray(ticketModel.getNumberTicket());
            int leftSide = 0, rightSide = 0;
            for (int i = 0; i < listNumbers.size(); i++) {
                if (i < 3) {
                    leftSide += listNumbers.get(i);
                } else {
                    rightSide += listNumbers.get(i);
                }
            }
            if (leftSide == rightSide) {
                count++;
            }
        }
        return count;
    }

    public int countingMethodPeter(List<TicketModel> ticketModels) {
        int count = 0;
        for (TicketModel ticketModel : ticketModels) {
            splitToIntegerArray(ticketModel.getNumberTicket());
            int oddNum = 0, evenNum = 0;
            for (int i = 0; i < listNumbers.size(); i++) {
                if (listNumbers.get(i) % 2 == 0) {
                    evenNum += listNumbers.get(i);
                } else {
                    oddNum += listNumbers.get(i);
                }
            }
            if (oddNum == evenNum) {
                count++;
            }
        }
        return count;
    }

}
