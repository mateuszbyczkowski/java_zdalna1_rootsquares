package pl.sda.html;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\MateuszByczkowski\\IdeaProjects\\excersises\\src\\main\\java\\pl\\sda\\plik_tekstowy.txt";

        File file = new File(path);
        Scanner scanner = new Scanner(file);

        HtmlParser htmlParser = new HtmlParser();

        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String upperCaseLine = htmlParser.lineHtmlToUpperCase(line);

            sb.append(upperCaseLine);
            sb.append('\n');
        }

        saveToFile(sb.toString());
    }

    public static void saveToFile(String html) throws IOException {
        String resulPath = "C:\\Users\\MateuszByczkowski\\IdeaProjects\\excersises\\src\\main\\java\\pl\\sda\\plik_wynik.txt";
        File file = new File(resulPath);

        FileWriter fileWriter = new FileWriter(file);

        fileWriter.write(html);
        fileWriter.close();
    }
}
