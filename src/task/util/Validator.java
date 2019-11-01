package task.util;

public class Validator {

    public String[] splitToArray(String str) {
        String[] contents = str.split(" ");
        return contents;
    }

    public boolean continuedRequests(String answer) {
        return answer.equals("YES") || answer.equals("Y") ;
    }

    public boolean getResultForTypeMoscowToChoose(String type) {
        return type.equals("MOSCOW");
    }

    public boolean getResultForTypePeterToChoose(String type) {
        return type.equals("PETER");
    }
}
