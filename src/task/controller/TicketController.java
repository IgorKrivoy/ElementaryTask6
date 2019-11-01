package task.controller;

import task.model.*;
import task.service.*;
import task.util.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TicketController {

    Input input = new Input();
    OutPut outPut = new OutPut();
    Validator validator = new Validator();
    TicketService ticketService = new TicketService();
    FileService fileService = new FileService();

    public void run() {
        while (true) {
            outPut.getInfoStart();
            String link = input.getString();
            try {
                chooseTypeCounting(link);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            outPut.getInfoRequestContinued();
            if (!validator.continuedRequests(input.getString().toUpperCase())) {
                break;
            }
        }
    }

    public List<TicketModel> getArrayOfTicketsModels(String[] arrayTickets) {
        List<TicketModel> ticketModels = new ArrayList<>();
        for (int i = 0; i < arrayTickets.length; i++) {
            ticketModels.add(new TicketModel(arrayTickets[i]));
        }
        return ticketModels;
    }

    public void chooseTypeCounting(String link) throws IOException {
        outPut.getInfoTypeCounting();
        String requestContinue = input.getString().toUpperCase();

        if (validator.getResultForTypeMoscowToChoose(requestContinue)) {
            outPut.getCountTickets(
                    ticketService.countingMethodMoscow(
                            getArrayOfTicketsModels(
                                    validator.splitToArray(
                                            fileService.readFromFile(
                                                    fileService.getFile(link))))));
        } else if (validator.getResultForTypePeterToChoose(requestContinue)) {
            outPut.getCountTickets(
                    ticketService.countingMethodPeter(
                            getArrayOfTicketsModels(
                                    validator.splitToArray(
                                            fileService.readFromFile(
                                                    fileService.getFile(link))))));
        }
        else {
            outPut.getInfoMistakeToInput();
        }
    }


}
