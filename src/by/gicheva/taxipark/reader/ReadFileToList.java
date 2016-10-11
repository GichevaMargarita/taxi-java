package by.gicheva.taxipark.reader;

import by.gicheva.taxipark.exception.NoInputFileException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFileToList {
    private List<String> lines = new ArrayList<String>();

    public ReadFileToList(){
    }

    public List<String> readFileToList(String folderName, String fileName) throws NoInputFileException {
        Path filePath = Paths.get(folderName, fileName);
        try {
            return Files.readAllLines(filePath, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new NoInputFileException();
        }
    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

}
