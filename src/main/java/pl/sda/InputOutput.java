package pl.sda;

import java.io.*;
import java.util.Scanner;

public class InputOutput {
    public static void readFromFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        String zawartoscPliku = "";
        while (scanner.hasNextLine()) {
            zawartoscPliku += scanner.nextLine() + ", ";
        }

        System.out.println(zawartoscPliku);
    }

    public static void writeToFile() throws IOException {
        File file = new File("src\\main\\java\\pl\\sda\\plik_tekstowy.txt");
        FileWriter printer = new FileWriter(file, true);
        printer.append("nie no Eryk jednak lubi koty");
        printer.close();
    }
}
