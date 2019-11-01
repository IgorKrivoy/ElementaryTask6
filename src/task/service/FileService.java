package task.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileService {

    public File getFile(String link) throws IOException {
        File file = new File(link);
        return file;
    }

    public String readFromFile(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String content = "";
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            content += line + " ";
        }
        return content;
    }
}
