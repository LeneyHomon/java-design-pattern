package practice;

import practice.objectAdapter.FileIO;
import practice.objectAdapter.FileProperties;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("02-Adapter/data/file.txt");
            f.setValue("year", "2021");
            f.setValue("month", "3");
            f.setValue("day", "21");
            f.writeToFile("02-Adapter/data/newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
